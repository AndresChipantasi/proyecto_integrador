-- Table: public.persons

-- DROP TABLE public.persons;

CREATE TABLE public.persons
(
    person_id integer NOT NULL DEFAULT nextval('persons_person_id_seq'::regclass),
    name character varying COLLATE pg_catalog."default",
    dni character varying COLLATE pg_catalog."default",
    created timestamp without time zone,
    enabled boolean,
    updated timestamp with time zone,
    password character varying COLLATE pg_catalog."default",
    email character varying COLLATE pg_catalog."default",
    username character varying COLLATE pg_catalog."default",
    archived boolean,
    rol_id integer,
    CONSTRAINT persons_pkey PRIMARY KEY (person_id),
    CONSTRAINT fk_rol FOREIGN KEY (rol_id)
        REFERENCES public.rol (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
)

TABLESPACE pg_default;

ALTER TABLE public.persons
    OWNER to postgres;