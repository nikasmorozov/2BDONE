CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

INSERT INTO task (uuid, created_at, description, is_completed)
VALUES
       (uuid_generate_v4(), timestamp '2014-01-10 10:00:00' +
                            random() * (timestamp '2021-12-10 20:00:00' -
                                        timestamp '2014-01-10 10:00:00'), 'First demo task', false),
       (uuid_generate_v4(), timestamp '2014-01-10 10:00:00' +
                            random() * (timestamp '2021-12-10 20:00:00' -
                                        timestamp '2014-01-10 10:00:00'), 'Second demo task', false),
       (uuid_generate_v4(), timestamp '2014-01-10 10:00:00' +
                            random() * (timestamp '2021-12-10 20:00:00' -
                                        timestamp '2014-01-10 10:00:00'), 'Third demo task', false),
       (uuid_generate_v4(), timestamp '2014-01-10 10:00:00' +
                            random() * (timestamp '2021-12-10 20:00:00' -
                                        timestamp '2014-01-10 10:00:00'), 'Fourth demo task', false),
       (uuid_generate_v4(), timestamp '2014-01-10 10:00:00' +
                            random() * (timestamp '2021-12-10 20:00:00' -
                                        timestamp '2014-01-10 10:00:00'), 'Fifth demo task', false);