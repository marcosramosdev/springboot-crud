CREATE TABLE IF NOT EXISTS TB_PERFIL (
                                         id SERIAL PRIMARY KEY,
                                         descricao VARCHAR(255) NOT NULL
    );


-- Inserindo dados na tabela TB_PERFIL
INSERT INTO TB_PERFIL (descricao) VALUES
                                      ('Administrador'),
                                      ('Usuário Comum'),
                                      ('Gerente de Projetos'),
                                      ('Analista de Sistemas'),
                                      ('Desenvolvedor Back-end'),
                                      ('Desenvolvedor Front-end'),
                                      ('Designer Gráfico'),
                                      ('Tester/QA'),
                                      ('DevOps'),
                                      ('Analista de Dados');



-- Certifique-se de que a tabela existe
CREATE TABLE IF NOT EXISTS TB_USUARIOS (
                                           id SERIAL PRIMARY KEY,
                                           nome VARCHAR(255) NOT NULL,
    login VARCHAR(255) NOT NULL,
    senha VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL
    );

-- Inserindo dados na tabela TB_USUARIOS
INSERT INTO TB_USUARIOS (nome, login, senha, email) VALUES
                                                        ('João Silva', 'joaosilva', 'senha123', 'joao.silva@email.com'),
                                                        ('Maria Oliveira', 'mariaoliveira', 'senha456', 'maria.oliveira@email.com'),
                                                        ('Carlos Souza', 'carlossouza', 'senha789', 'carlos.souza@email.com'),
                                                        ('Ana Costa', 'anacosta', 'senha101', 'ana.costa@email.com'),
                                                        ('Lucas Santos', 'lucassantos', 'senha202', 'lucas.santos@email.com'),
                                                        ('Fernanda Lima', 'fernandalima', 'senha303', 'fernanda.lima@email.com'),
                                                        ('Paulo Almeida', 'pauloalmeida', 'senha404', 'paulo.almeida@email.com'),
                                                        ('Beatriz Rocha', 'beatrizrocha', 'senha505', 'beatriz.rocha@email.com'),
                                                        ('Rafael Martins', 'rafaelmartins', 'senha606', 'rafael.martins@email.com'),
                                                        ('Camila Pereira', 'camilapereira', 'senha707', 'camila.pereira@email.com');