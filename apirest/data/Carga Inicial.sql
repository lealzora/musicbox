/*
 	Script para carga inicial de registros conforme solicitado 
*/

DO $$    
BEGIN	
/*
 *	Cria a tabela {album} caso ela não existir.
 */
IF NOT EXISTS (SELECT * FROM pg_catalog.pg_tables 
				WHERE  schemaname = 'public'
				  AND  tablename  = 'album') THEN

		CREATE TABLE public.album
		(
			id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1 ),
			ano_lancamento timestamp without time zone,
			artista bigint NOT NULL,
			nome character varying(255) COLLATE pg_catalog."default",
			CONSTRAINT album_pkey PRIMARY KEY (id)
		)

		TABLESPACE pg_default;
		ALTER TABLE public.album OWNER to postgres;
END IF;

/*
 *	Cria a tabela {artista} caso ela não existir.
 */
IF NOT EXISTS (SELECT * FROM pg_catalog.pg_tables 
			WHERE  schemaname = 'public'
			  AND  tablename  = 'artista') THEN

		CREATE TABLE public.artista
		(
			id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1 ),
			nome character varying(255) COLLATE pg_catalog."default",
			CONSTRAINT artista_pkey PRIMARY KEY (id)
		)
		TABLESPACE pg_default;
		ALTER TABLE public.artista OWNER to postgres;
END IF;
	
END
$$ ;


/*
	Insere dados iniciais nas tabelas Artista e Album
*/

TRUNCATE album RESTART IDENTITY;		
TRUNCATE artista RESTART IDENTITY;

INSERT INTO public.artista (nome)
VALUES 	 
 	('Serj Tankian')	
	,('Mike Shinoda')   
	,('Michel Teló')	
	,('Guns N'' Roses')	;
	
	
INSERT INTO public.album(ano_lancamento, artista, nome)
VALUES 
	 (null, 1, 'Harakiri')
	,(null, 1, 'Black Blooms')
	,(null, 1, 'The Rough Dog')
	,(null, 2, 'The Rising Tied')
	,(null, 2, 'Post Traumatic')
	,(null, 2, 'Post Traumatic EP')
	,(null, 2, 'Where''d You Go')
	,(null, 3, 'Bem Sertanejo - O Show (Ao Vivo)')
	,(null, 3, 'Bem Sertanejo - (1ª Temporada) - EP')
	,(null, 4, 'Use Your Illusion I')
	,(null, 4, 'Use Your Illusion II')
	,(null, 4, 'Greatest Hits');