INSERT INTO users (id, username, password, name, surname) VALUES
                                                              (1, 'user',
                                                               '{bcrypt}$2y$12$Asaa8kGQMLq5IQ2LNb2VEeF6zKX4larg/rvALtrzLlJhczyl6teWC', 'Vardenis', 'Pavardenis'), /*pass*/
                                                              (2, 'admin',
                                                               '{bcrypt}$2y$12$RZ77B8lWhj..N1EA5Z2Q5.LnQ5YcwjhNaA13EljO6BvGMVeQeD4yO', 'Adminas', 'Adminauskas'); /*admin*/

INSERT INTO roles (id, name) VALUES
                                 (1, 'USER'),
                                 (2, 'ADMIN');

INSERT INTO users_roles (user_id, roles_id) VALUES
                                                (1, 1), /* user -> USER ROLE */
                                                (2, 2),
                                                (2, 1); /* admin -> USER, ADMIN ROLES */
