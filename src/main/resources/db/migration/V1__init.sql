CREATE TABLE product (
    id bigint NOT NULL,
    average_rating integer NOT NULL,
    category integer,
    number_of_ratings integer NOT NULL,
    rating_total integer NOT NULL,
    url character varying(255) NOT NULL
);

--
-- Name: product_id_seq; Type: SEQUENCE; Schema: public; Owner: admin
--

CREATE SEQUENCE product_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

--
-- Name: product_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: admin
--

ALTER SEQUENCE product_id_seq OWNED BY product.id;

ALTER TABLE ONLY product ALTER COLUMN id SET DEFAULT nextval('product_id_seq'::regclass);

insert into product (category, url, number_of_ratings, rating_total, average_rating) VALUES (1, 'Google.ca', 1, 1, 1);
insert into product (category, url, number_of_ratings, rating_total, average_rating) VALUES (2, 'Amazon.com', 2, 2, 2);
insert into product (category, url, number_of_ratings, rating_total, average_rating) VALUES (3, 'Carleton.ca', 3, 3, 3);