CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

INSERT INTO task (uuid, created_at, description, is_done)
VALUES
       (uuid_generate_v4(), '2016-06-22 19:10:25-07', 'First demo Task', false),
       (uuid_generate_v4(), '2016-06-22 19:10:25-07', 'Second demo Task', false),
       (uuid_generate_v4(), timestamp '2014-01-10 10:00:00' +
                            random() * (timestamp '2021-12-10 20:00:00' -
                                        timestamp '2014-01-10 10:00:00'), 'Third demo Task', false);