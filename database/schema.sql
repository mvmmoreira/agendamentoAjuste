CREATE DATABASE clinica_aline;
USE clinica_aline;
SELECT DATABASE();
CREATE TABLE endereco ( id_endereco INT PRIMARY KEY AUTO_INCREMENT,
						logradouro VARCHAR(100) NOT NULL,
                        numero VARCHAR(10) NOT NULL,
                        bairro VARCHAR(100) NOT NULL,
                        cidade VARCHAR(100) NOT NULL,
                        estado VARCHAR(2) NOT NULL,
                        cep VARCHAR(10) NOT NULL
                        );
CREATE TABLE cliente ( id_cliente INT PRIMARY KEY AUTO_INCREMENT,
						nome VARCHAR(100) NOT NULL,
                        telefone VARCHAR(20) NOT NULL,
                        email VARCHAR(100) NOT NULL, 
                        cpf VARCHAR(14) NOT NULL,
                        id_endereco INT,
                        
                        FOREIGN KEY (id_endereco)
								REFERENCES endereco(id_endereco)
						);
CREATE TABLE profissional ( id_profissional INT PRIMARY KEY AUTO_INCREMENT,
							nome VARCHAR(100) NOT NULL,
                            crefito VARCHAR(10) NOT NULL,
                            telefone VARCHAR(15) NOT NULL,
                            especialidade VARCHAR(15) NOT NULL,
                            id_endereco INT,
                            
                            FOREIGN KEY (id_endereco)
									REFERENCES endereco(id_endereco)
						);
CREATE TABLE procedimento (id_procedimento INT PRIMARY KEY AUTO_INCREMENT,
							nome VARCHAR(20) NOT NULL,
                            tipo VARCHAR(15) NOT NULL,
                            valor DECIMAL(10,2) NOT NULL,
                            duracao_minutos INT NOT NULL
						);
CREATE TABLE agendamento (id_agendamento INT PRIMARY KEY AUTO_INCREMENT,
							data_hora DATETIME NOT NULL,
                            status_ VARCHAR(10) NOT NULL,
                            observacao TEXT NOT NULL,
                            id_procedimento INT,
                            id_cliente INT,
                            id_profissional INT,
                            
                            FOREIGN KEY (id_procedimento)
								REFERENCES procedimento(id_procedimento),
							FOREIGN KEY (id_cliente)
								REFERENCES 	cliente(id_cliente),
							FOREIGN KEY (id_profissional)
								REFERENCES profissional(id_profissional)
							);

                            
                            
                            
                            