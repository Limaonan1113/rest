CREATE TABLE `user` (
	`id` VARCHAR ( 250 ) COLLATE utf8_bin NOT NULL,
	`name` VARCHAR ( 50 ) COLLATE utf8_bin DEFAULT NULL,
	`phone_number` VARCHAR ( 12 ) COLLATE utf8_bin DEFAULT NULL,
	`email` VARCHAR ( 40 ) COLLATE utf8_bin DEFAULT NULL,
	`address` VARCHAR ( 255 ) COLLATE utf8_bin DEFAULT NULL,
PRIMARY KEY ( `id` )
) ENGINE = INNODB DEFAULT CHARSET = utf8 COLLATE = utf8_bin;


CREATE TRIGGER id_trigger
 BEFORE INSERT on mangoudb.user
for EACH ROW
BEGIN

		SET new.id=REPLACE(UUID(),'-','');

END ;