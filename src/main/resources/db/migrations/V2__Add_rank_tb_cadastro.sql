-- V2: Migrations para adicionar coluna de RANK na tabela TB_CADASTRO

ALTER TABLE TB_CADASTRO
ADD COLUMN rank VARCHAR(255);