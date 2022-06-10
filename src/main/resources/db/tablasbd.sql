

DROP TABLE IF EXISTS `ciudades`;

CREATE TABLE `ciudades` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ciudad` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
)


INSERT INTO `ciudades` VALUES (1,'San Salvador'),(2,'San José'),(3,'Managua'),(4,'Los Ángeles'),(5,'San Francisco');



DROP TABLE IF EXISTS `clientes`;

CREATE TABLE `clientes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombres` varchar(45) NOT NULL,
  `apellidos` varchar(45) NOT NULL,
  `telefono` varchar(9) NOT NULL,
  `email` varchar(75) DEFAULT NULL,
  `ciudades_id` int(11) NOT NULL,
  PRIMARY KEY (`id`,`ciudades_id`),
  KEY `fk_clientes_ciudades_idx` (`ciudades_id`),
  CONSTRAINT `fk_clientes_ciudades` FOREIGN KEY (`ciudades_id`) REFERENCES `ciudades` (`id`)
)
--
-- Dumping data for table `clientes`
--


INSERT INTO `clientes` VALUES (1,'Diana','Lima','7458-2356','diana@gmail.com',1),(3,'Roxana Carolina','López','2451-7845','roxan@test.com',5),(8,'JORGE','AGUIRRE','2451-7845','JORG@TEST.COM',3);




DROP TABLE IF EXISTS `roles`;

CREATE TABLE `roles` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `rol` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_id_rol_unique` (`user_id`,`rol`) /*!80000 INVISIBLE */,
  CONSTRAINT `fk_rol_user` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
)
INSERT INTO `roles` VALUES (1,1,'ROLE_USER'),(2,2,'ROLE_USER'),(3,2,'ROLE_ADMIN');



DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(60) NOT NULL,
  `enabled` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`),
  UNIQUE KEY `username_UNIQUE` (`username`)
)

INSERT INTO `users` VALUES (1,'user','$2a$10$WcfCTc80pJquE5KonjuF..67hNx02CiHhkpZWRHRXYza.EF.yabjS',1),(2,'admin','$2a$10$0XjVZkDpnnnlhQjnXPgD0uWrTjp7pi6Qp5NuiURQebJaN7Pl72sra',1);


-- Dump completed on 2019-10-26 10:21:41
