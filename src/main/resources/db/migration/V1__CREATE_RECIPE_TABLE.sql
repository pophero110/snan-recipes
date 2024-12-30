CREATE EXTENSION IF NOT EXISTS "uuid-ossp" SCHEMA ${schema};

CREATE TABLE RECIPE
(
    ID          UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    TITLE       VARCHAR(40)                                NOT NULL,
    CREATED_TS  TIMESTAMP        DEFAULT CURRENT_TIMESTAMP NOT NULL,
    MODIFIED_TS TIMESTAMP        DEFAULT CURRENT_TIMESTAMP NOT NULL
);