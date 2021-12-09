CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

INSERT INTO task (uuid, created_at, description, is_completed)
VALUES
       (uuid_generate_v4(), timestamp '2014-01-10 10:00:00' +
                            random() * (timestamp '2021-12-10 20:00:00' -
                                        timestamp '2014-01-10 10:00:00'), 'Pabaigti security Spring Boot - React projekte', false),
       (uuid_generate_v4(), timestamp '2014-01-10 10:00:00' +
                            random() * (timestamp '2021-12-10 20:00:00' -
                                        timestamp '2014-01-10 10:00:00'), 'Aplankyti senelius', false),
       (uuid_generate_v4(), timestamp '2014-01-10 10:00:00' +
                            random() * (timestamp '2021-12-10 20:00:00' -
                                        timestamp '2014-01-10 10:00:00'), 'Nupirkti bulvių', false),
       (uuid_generate_v4(), timestamp '2014-01-10 10:00:00' +
                            random() * (timestamp '2021-12-10 20:00:00' -
                                        timestamp '2014-01-10 10:00:00'), 'Paplaukioti', false),
       (uuid_generate_v4(), timestamp '2014-01-10 10:00:00' +
                            random() * (timestamp '2021-12-10 20:00:00' -
                                        timestamp '2014-01-10 10:00:00'), 'Sėkmingai parašyti testą', false);