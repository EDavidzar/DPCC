/*M!999999\- enable the sandbox mode */ 
-- MariaDB dump 10.19-11.8.3-MariaDB, for Linux (x86_64)
--
-- Host: localhost    Database: ccpd_impactevaluation
-- ------------------------------------------------------
-- Server version	11.8.3-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*M!100616 SET @OLD_NOTE_VERBOSITY=@@NOTE_VERBOSITY, NOTE_VERBOSITY=0 */;

--
-- Current Database: `ccpd_impactevaluation`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `ccpd_impactevaluation` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci */;

USE `ccpd_impactevaluation`;

--
-- Table structure for table `impactevaluationtable`
--

DROP TABLE IF EXISTS `impactevaluationtable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;
CREATE TABLE `impactevaluationtable` (
  `id_impact_evaluation` int(11) NOT NULL,
  `whyimpactassessmentneeded` longtext DEFAULT NULL,
  `datasensibility` longtext DEFAULT NULL,
  `treatmentpurposes` longtext DEFAULT NULL,
  `dataprocessingtypesrequireEIPD` longtext DEFAULT NULL,
  `datalifecycle` longtext DEFAULT NULL,
  `proportionalityandnecessityoftreatment` longtext DEFAULT NULL,
  `informationconfidenciality` longtext DEFAULT NULL,
  `InformationAvailabilityAndIntegrity` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_impact_evaluation`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `operationstype`
--

DROP TABLE IF EXISTS `operationstype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;
CREATE TABLE `operationstype` (
  `idoperationstype` int(11) NOT NULL DEFAULT 1,
  `operationstypeincluded` varchar(255) NOT NULL,
  `data description` longtext DEFAULT NULL,
  PRIMARY KEY (`idoperationstype`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;
--
-- Current Database: `ccpd_autenticate`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `ccpd_autenticate` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;

USE `ccpd_autenticate`;

--
-- Table structure for table `autenticate_table`
--

DROP TABLE IF EXISTS `autenticate_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;
CREATE TABLE `autenticate_table` (
  `id_autenticate_table_client` int(11) NOT NULL AUTO_INCREMENT,
  `clientname` varchar(255) NOT NULL DEFAULT 'name',
  `clientpassword` varchar(128) NOT NULL DEFAULT 'password',
  `priority` int(11) DEFAULT 1,
  PRIMARY KEY (`id_autenticate_table_client`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `impactevaluationtable`
--

DROP TABLE IF EXISTS `impactevaluationtable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;
CREATE TABLE `impactevaluationtable` (
  `id_impact_evaluation` int(11) NOT NULL,
  `whyimpactassessmentneeded` longtext DEFAULT NULL,
  `datasensibility` longtext DEFAULT NULL,
  `treatmentpurposes` longtext DEFAULT NULL,
  `dataprocessingtypesrequireEIPD` longtext DEFAULT NULL,
  `datalifecycle` longtext DEFAULT NULL,
  `proportionalityandnecessityof treatment` longtext DEFAULT NULL,
  `informationconfidenciality` longtext DEFAULT NULL,
  `InformationAvailabilityAndIntegrity` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_impact_evaluation`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Current Database: `ccpd_clients`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `ccpd_clients` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;

USE `ccpd_clients`;

--
-- Table structure for table `dbclients`
--

DROP TABLE IF EXISTS `dbclients`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;
CREATE TABLE `dbclients` (
  `id_dbclients` int(11) NOT NULL AUTO_INCREMENT,
  `client_name` varchar(255) NOT NULL,
  `client_surname` varchar(255) NOT NULL,
  `client_address` varchar(255) NOT NULL,
  `client_nif` varchar(255) NOT NULL,
  `client_stgateorregion` varchar(255) NOT NULL,
  `client_province` varchar(255) NOT NULL,
  `client_country` varchar(255) NOT NULL,
  `client_location` varchar(255) NOT NULL,
  `client_postalcode` varchar(45) NOT NULL,
  `client_telephone` varchar(45) NOT NULL,
  `client_fax` varchar(45) DEFAULT NULL,
  `client_email` varchar(255) DEFAULT NULL,
  `client_webpage` varchar(255) DEFAULT NULL,
  `id_enterprise` int(11) NOT NULL DEFAULT 1,
  `nickname` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_dbclients`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Current Database: `ccpd_compliancereports`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `ccpd_compliancereports` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;

USE `ccpd_compliancereports`;

--
-- Table structure for table `answers`
--

DROP TABLE IF EXISTS `answers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;
CREATE TABLE `answers` (
  `id_answers` int(11) NOT NULL AUTO_INCREMENT,
  `excluded` bigint(20) DEFAULT NULL,
  `id_client` int(11) DEFAULT NULL,
  `id_question` int(11) NOT NULL,
  `theanswer` bigint(20) DEFAULT NULL,
  `id_enterprise` int(11) NOT NULL DEFAULT 1,
  PRIMARY KEY (`id_answers`)
) ENGINE=InnoDB AUTO_INCREMENT=121 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `answers`
--

LOCK TABLES `answers` WRITE;
/*!40000 ALTER TABLE `answers` DISABLE KEYS */;
set autocommit=0;
INSERT INTO `answers` VALUES
(1,0,1,0,0,1),
(2,0,1,0,0,1),
(3,0,1,0,0,1),
(4,0,1,0,0,1),
(5,0,1,0,0,1),
(6,0,1,0,0,1),
(7,0,1,0,0,1),
(8,0,1,0,0,1),
(9,0,1,0,0,1),
(10,0,1,0,0,1),
(11,0,1,0,0,1),
(12,0,1,0,0,1),
(13,0,1,0,0,1),
(14,0,1,0,0,1),
(15,0,1,0,0,1),
(16,0,1,0,0,1),
(17,0,1,0,0,1),
(18,0,1,0,0,1),
(19,0,1,0,0,1),
(20,0,1,0,0,1),
(21,0,1,0,0,1),
(22,0,1,0,0,1),
(23,0,1,0,0,1),
(24,0,1,0,0,1),
(25,0,1,0,0,1),
(26,0,1,0,1,1),
(27,0,1,0,0,1),
(28,0,1,0,1,1),
(29,0,1,0,0,1),
(30,0,1,0,0,1),
(31,0,1,0,0,1),
(32,0,1,0,0,1),
(33,0,1,0,0,1),
(34,0,1,0,0,1),
(35,0,1,0,0,1),
(36,0,1,0,0,1),
(37,0,1,0,0,1),
(38,0,1,0,0,1),
(39,0,1,0,0,1),
(40,0,1,0,0,1),
(41,0,1,0,0,1),
(42,0,1,0,0,1),
(43,0,1,0,0,1),
(44,0,1,0,0,1),
(45,0,1,0,0,1),
(46,0,1,0,0,1),
(47,0,1,0,0,1),
(48,0,1,0,0,1),
(49,0,1,0,0,1),
(50,0,1,0,0,1),
(51,0,1,0,0,1),
(52,0,1,0,0,1),
(53,0,1,0,0,1),
(54,0,1,0,0,1),
(55,0,1,0,0,1),
(56,0,1,0,0,1),
(57,0,1,0,0,1),
(58,0,1,0,1,1),
(59,0,1,0,0,1),
(60,0,1,0,1,1),
(61,0,1,0,0,1),
(62,0,1,0,0,1),
(63,0,1,0,0,1),
(64,0,1,0,0,1),
(65,0,1,0,0,1),
(66,0,1,0,0,1),
(67,0,1,0,0,1),
(68,0,1,0,0,1),
(69,0,1,0,0,1),
(70,0,1,0,0,1),
(71,0,1,0,0,1),
(72,0,1,0,0,1),
(73,0,1,0,0,1),
(74,0,1,0,0,1),
(75,0,1,0,0,1),
(76,0,1,0,0,1),
(77,0,1,0,0,1),
(78,0,1,0,0,1),
(79,0,1,0,0,1),
(80,0,1,0,0,1),
(81,0,1,0,0,1),
(82,0,1,0,0,1),
(83,0,1,0,0,1),
(84,0,1,0,0,1),
(85,0,1,0,0,1),
(86,0,1,0,0,1),
(87,0,1,0,0,1),
(88,0,1,0,0,1),
(89,0,1,0,0,1),
(90,0,1,0,1,1),
(91,0,1,0,0,1),
(92,0,1,0,1,1),
(93,0,1,0,0,1),
(94,0,1,0,0,1),
(120,0,1,0,0,1);
/*!40000 ALTER TABLE `answers` ENABLE KEYS */;
UNLOCK TABLES;
commit;

--
-- Table structure for table `excluded`
--

DROP TABLE IF EXISTS `excluded`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;
CREATE TABLE `excluded` (
  `id_excluded` int(11) NOT NULL AUTO_INCREMENT,
  `ncatex` int(11) NOT NULL,
  PRIMARY KEY (`id_excluded`)
) ENGINE=InnoDB AUTO_INCREMENT=55 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `excluded`
--

LOCK TABLES `excluded` WRITE;
/*!40000 ALTER TABLE `excluded` DISABLE KEYS */;
set autocommit=0;
INSERT INTO `excluded` VALUES
(1,7),
(2,8),
(3,9),
(4,6),
(5,10),
(6,1),
(7,13),
(8,14),
(9,16),
(10,7),
(11,8),
(12,9),
(13,6),
(14,10),
(15,4),
(16,13),
(17,14),
(18,16),
(19,7),
(20,8),
(21,9),
(22,6),
(23,10),
(24,1),
(25,13),
(26,14),
(27,16),
(28,7),
(29,8),
(30,9),
(31,6),
(32,10),
(33,4),
(34,13),
(35,14),
(36,16),
(37,7),
(38,8),
(39,9),
(40,6),
(41,10),
(42,1),
(43,13),
(44,14),
(45,16),
(46,7),
(47,8),
(48,9),
(49,6),
(50,10),
(51,4),
(52,13),
(53,14),
(54,16);
/*!40000 ALTER TABLE `excluded` ENABLE KEYS */;
UNLOCK TABLES;
commit;

--
-- Table structure for table `question_types`
--

DROP TABLE IF EXISTS `question_types`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;
CREATE TABLE `question_types` (
  `id_question_types` int(11) NOT NULL AUTO_INCREMENT,
  `question_types_name` varchar(255) NOT NULL,
  PRIMARY KEY (`id_question_types`)
) ENGINE=InnoDB AUTO_INCREMENT=55 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `question_types`
--

LOCK TABLES `question_types` WRITE;
/*!40000 ALTER TABLE `question_types` DISABLE KEYS */;
set autocommit=0;
INSERT INTO `question_types` VALUES
(1,'general - calidad de los datos'),
(2,'general - derecho de información en la recogida de datos'),
(3,'general - consentimiento del afectado'),
(4,'general - consentimiento para el tratamiento de datos'),
(5,'general - revocación del consentimiento'),
(6,'general - Ficheros de información sobre solvencia patrimonial y crédito'),
(7,'general - Tratamiento para actividades de publicidad y prospección comercial'),
(8,'general - Tratamiento para actividades de publicidad y prospección comercial'),
(9,'Datos especialmente protegidos - Ficheros de datos personales referentes a ideología, creencias o religión'),
(10,'Datos especialmente protegidos - Datos relativos a la salud'),
(11,'general - Seguridad de los datos'),
(12,'general - Deber de secreto'),
(13,'general - Comunicación de datos'),
(14,'generales - nivel básico'),
(15,'generales - nivel medio'),
(16,'generales - nivel alto'),
(17,'generales-documento de seguridad'),
(18,'ficheros automatizados - nivel básico - funciones y obligaciones del personal'),
(19,'ficheros automatizados - nivel básico - registro de incidencias'),
(20,'ficheros automatizados - nivel básico - Identificación y autenticación'),
(21,'ficheros automatizados - nivel básico - Control de acceso'),
(22,'ficheros automatizados - nivel básico - Gestión de soportes y documentos'),
(23,'ficheros automatizados - nivel básico - Copias de respaldo y recuperación'),
(24,'ficheros automatizados - nivel medio - documento de seguridad'),
(25,'ficheros automatizados - nivel medio - el responsable de seguridad'),
(26,'ficheros automatizados - nivel medio - las auditorías'),
(27,'ficheros automatizados - nivel medio - Identificación y autenticación'),
(28,'ficheros automatizados - nivel medio - control de acceso físico'),
(29,'ficheros automatizados - nivel medio - gestión de soportes'),
(30,'ficheros automatizados - nivel medio - registro de incidencias'),
(31,'ficheros automatizados - nivel medio - pruebas con datos reales'),
(32,'ficheros automatizados - nivel alto - distribución y gestión de soportes'),
(33,'ficheros automatizados - nivel alto - registro de accesos'),
(34,'ficheros automatizados - nivel alto - copias de respaldo y recuperación'),
(35,'ficheros automatizados - nivel alto - telecomunicaciones'),
(36,'ficheros no automatizados - nivel básico'),
(37,'ficheros no automatizados - nivel medio'),
(38,'ficheros no automatizados - nivel alto'),
(39,'general – personas fallecidas'),
(40,'general – derechos digitales'),
(41,'general – delegado de protección de datos'),
(42,'general – responsable y encargado del tratamiento'),
(43,'general – delegado de protección de datos'),
(44,'general – códigos de conducta y certificación'),
(45,'general -  ejercicio de los derechos'),
(46,'Disposiciones aplicables a tratamientos concretos - Tratamiento de datos de contacto, de empresarios individuales y de profesionales liberales'),
(47,'Disposiciones aplicables a tratamientos concretos - Sistemas de información crediticia'),
(48,'Disposiciones aplicables a tratamientos concretos - Tratamientos relacionados con la realización de determinadas operaciones Mercantiles.'),
(49,'Disposiciones aplicables a tratamientos concretos - Tratamientos con fines de videovigilancia.'),
(50,'Disposiciones aplicables a tratamientos concretos - Sistemas de exclusión publicitaria.'),
(51,'Disposiciones aplicables a tratamientos concretos - Sistemas de información de denuncias internas.'),
(52,'Disposiciones aplicables a tratamientos concretos - Tratamiento de datos con fines de archivo en interés público por parte de las Administraciones Públicas.'),
(53,'Disposiciones aplicables a tratamientos concretos - Tratamiento de datos relativos a infracciones y sanciones administrativas.'),
(54,'Principios de protección de datos');
/*!40000 ALTER TABLE `question_types` ENABLE KEYS */;
UNLOCK TABLES;
commit;

--
-- Table structure for table `questions`
--

DROP TABLE IF EXISTS `questions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;
CREATE TABLE `questions` (
  `id_questions` int(11) NOT NULL AUTO_INCREMENT,
  `question_name` longtext NOT NULL,
  `question_recomendation` longtext NOT NULL,
  `id_questiontype` int(11) NOT NULL,
  PRIMARY KEY (`id_questions`)
) ENGINE=InnoDB AUTO_INCREMENT=192 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `questions`
--

LOCK TABLES `questions` WRITE;
/*!40000 ALTER TABLE `questions` DISABLE KEYS */;
set autocommit=0;
INSERT INTO `questions` VALUES
(1,'¿Recoge los datos personales para su tratamiento solamente cuando son adecuados, pertinentes y no excesivos en relación con el ámbito y las finalidades determinadas, explícitas y legítimas para las que se hayan obtenido?','La ley de Protección de Datos dice que los datos personales solo se deben recoger para su tratamiento cuando son adecuados, pertinentes y no excesivos en relación con el ámbito y las finalidades determinadas, explícitas y legítimas para las que se hayan obtenido. Por ejemplo no se le puede decir al afectado que se recopilan los datos para tramitarlos para una actividad empresarial determinada y luego se venden a otras empresas o se destinan  a otras finalidades.',1),
(2,'¿ Los datos de carácter personal recogidos se usan para finalidades compatibles con aquellas para las que los datos hubieran sido recogidos?','Debe recoger los datos personales para su tratamiento solamente cuando son adecuados, pertinentes y no excesivos en relación con el ámbito y las finalidades determinadas, explícitas y legítimas para las que se hayan obtenido, sino puede ser sancionado por la Agencia de Protección de Datos con el coste económico y el desprestigio que conlleva para su empresa.',1),
(3,'¿ Los datos de carácter personal recogidos son exactos y puestos al día respondiendo a la situación actual del afectado o afectados?','Según la Ley de Datos Personales los datos recogidos deben ser exactos y deben estar puestos al día.Si no lo están el interesado tiene derecho a su rectificación o cancelación, además ¿para que guardar datos no actualizados que no responden a la realidad?',1),
(4,'¿Si los datos de carácter personal son inexactos en todo o en parte o incompletos son cancelados y se sustituyen de oficio por los correspondientes datos rectificados o completados sin perjuicio de los derechos de rectificación y cancelación de los afectados?','Si los datos de carácter personal son inexactos en todo o en parte o incompletos deben ser cancelados y sustituirse de oficio por los correspondientes datos rectificados o contemplados.',1),
(5,'¿ Se cancelan los datos cuando han dejado de ser necesarios o pertinentes para la finalidad para la cual han sido recabados o registrados?','Deben cancelarse los datos cuando han dejado de ser necesarios o pertinentes para la finalidad para la cual han sido recabados o registrados',1),
(6,'¿ Se conservan los datos personales de forma que impidan que el interesado sea identificado durante un período superior al necesario para los fines en base a los cuales hubieran sido recabados o registrados?','Deben cancelarse los datos para evitar que se produzca la identificación del interesado durante un período superior al necesario. Además esta práctica puede suponer sanción por parte de la Agencia de Protección de Datos con el coste económico y el desprestigio que conlleva para su empresa.',1),
(7,'¿ Se almacenan los datos de carácter personal de manera que permitan el ejercicio del derecho de acceso, salvo legalmente cancelados?','El afectado tiene derecho a acceder a sus datos y rectificarlos o cancelarlos. o de oponerse a su tratamiento.Si no es así puede suponer sanción por parte de la Agencia de Protección de Datos con el coste económico y el desprestigio que conlleva para su empresa',1),
(8,'¿Se evita que se almacenen los datos personales por medios fraudulentos, desleales o ilícitos?','Si es así puede suponer sanción por parte de la Agencia de Protección de Datos con el coste económico y el desprestigio que conlleva para su empresa, además de las posibles responsabilidades penales, por lo tanto debe abstenerse de realizar estas práctica',1),
(9,'¿Se solicitan los datos en el marco de una relación contractual siempre para fines relacionados directamente con la misma y no con otros fines?','Solo se deben solicitar datos en el marco de una relación contractual para fines relacionados directamente en la misma. Si no lo hace así, esta práctica puede suponer sanción por parte de la Agencia de Protección de Datos con el coste económico y el desprestigio para su empresa.',1),
(10,'¿ Se informa previamente a los interesados a los que soliciten datos personales de modo expreso, preciso e inequívoco?','Debe informar a los interesados previamente a la recogida de sus datos de forma inequívoca, expresa y precisa para que puedan ejercer sus derechos de acceso, cancelación y rectificación.',2),
(11,'¿ Se obtiene el consentimiento inequívoco del afectado para el tratamiento de los datos de carácter personal?','Si el consentimiento del afectado no se obtiene o no se puede garantizar que sea inequívoco no puede tratar los datos personales del interesado hasta que no se obtenga el consentimiento inequívoco de este.',3),
(12,'¿Cuando no es necesario su consentimiento y el afectado se opone por haber motivos fundados y legítimos el responsable del fichero excluye del tratamiento los datos personales relativos al afectado?','Si hay motivos fundados y legítimos, el responsable del fichero no puede efectuar ningún tratamiento de esos datos y por lo tanto debe excluirse del tratamiento los datos personales relativos al afectado.',3),
(13,'¿Solicita el consentimiento a los mayores de 14 años para el tratamiento de sus datos personales?','Debe solicitar el consentimiento a mayores de 14 años para poder efectuar el tratamiento de sus datos personales.',4),
(14,'En el caso de que la ley lo exija ¿solicita el consentimiento de los mayores de 14 años con la asistencia de los titulares de la patria potestad o tutela?','Debe solicitar el consentimiento en el caso de los mayores de 14 años con la asistencia de sus representantes legales si la ley lo estipula así, serviría también la prueba del consentimiento de los mismos.',4),
(15,'¿Se evita recabar datos del menor que permitan obtener información sobre los demás miembros del grupo familiar o sus características?','No se pueden recabar este tipo de datos.Esta práctica puede suponer sanción por parte de la Agencia de Protección de Datos con el coste económico y el desprestigio que conlleva para su empresa, además de las posibles responsabilidades penales, por lo tanto debe abstenerse de realizar estas prácticas de inmediato.',4),
(16,'¿Se utiliza para recabar los datos un lenguaje comprensible para los menores?','Los menores deben entender para que se recogen sus datos.',4),
(17,'¿El responsable del fichero ha desarrollado los procedimientos necesarios para comprobar de modo efectivo la edad del menor y la autenticidad del consentimiento prestado en su caso, por los padres, tutores o representantes legales?','Debe desarrollar un procedimiento de manera que se pueda comprobar de manera efectiva la edad del menor y la autenticidad del consentimiento prestado por sus padres, tutores o representantes legales si fuera necesario. NPreguntasCreate.add(new NPreguntas(por ejemplo solicitud por escrito a los padres que deben firmar, libro de familia, dni, etc.).',4),
(18,'¿El afectado puede revocar su consentimiento a través de un medio sencillo, gratuito y que no implique ingreso alguno para el responsable del fichero o tratamiento?\\\\r\\\\n','Uno de los derechos del afectado es la revocación del consentimiento para el tratamiento de sus datos personales.Debe arbitrar un procedimiento para que el afectado pueda revocar su consentimiento a través de un medio sencillo y gratuito para el mismo.',5),
(19,'¿Se cumplen los requisitos del art. 38 del Reglamento de Protección de Datos para poder obtener información sobre datos personales?,que la deuda sea cierta, vencida, exigible,que haya resultado impagada,que no se haya entablado reclamación judicial, arbitral o administrativa,\\nsi se trata de servicios financieros que no se haya planteado una reclamación  en los términos previstos en el Reglamento para los comisionados para la defensa del cliente de servicios financieros,\\nque no hayan transcurrido seis años desde la fecha en que hubo de procederse al pago de la deuda o del vencimiento de la obligación o del plazo concreto si aquella fuera de vencimiento periódico.\\nrequerimiento previo del pago a quién corresponda el pago de la obligación.','Se deben cumplir estos requisitos para poder obtener información sobre datos personales. Si no se dan estos requisitos no es posible generar los ficheros sobre solvencia patrimonial y crédito.',6),
(20,'¿Se produce la información previa a la inclusión ?','Debe informar a los interesados previamente a la recogida de sus datos de forma inequívoca, expresa y precisa para que puedan ejercer sus derechos de acceso, cancelación y rectificación.',6),
(21,'¿Se produce la notificación de la inclusión?','Se debe notificar a los interesados su inclusión en un fichero de estas características.',6),
(22,'¿Se efectúa el tratamiento de los datos personales cumpliendo los siguientes requisitos?,que los datos figuran en alguna de las fuentes accesibles al público y el afectado no se haya negado a su tratamiento,han sido facilitados por los propios interesados u obtenidos con su consentimiento para esas finalidades,\\nse ha informado a los interesados de los sectores específicos y concretos de su actividad de los que recibirá información o publicidad.','Para poder tratar los datos con el fin de actividades de publicidad y prospección comercial deben de cumplirse estos requisitos.',7),
(23,'¿Se producen transferencias, ya sean temporales o definitivas de datos de carácter personal que hayan sido objeto de tratamiento o hayan sido recogidas con objeto de tratamiento con destino a países que no proporcionan un nivel de protección equiparable al de la LOPD?','Está prohibida la transferencia de datos personales entre España y otros países si estos no cumplen un nivel de protección equiparable al de la LOPD, salvo que se cumplan las excepciones del art. 34 LOPD.',7),
(24,'¿ Cuando son datos personales referentes a ideología, creencias o religión, se advierte al interesado que tiene derecho a no prestar el consentimiento para que traten sus datos?','Deberá advertir previamente a la prestación del consentimiento por parte del interesado de los derechos que tiene sobre sus datos personales si tienen que ver sobre ideología, creencias o religión a no prestar el consentimiento.',9),
(25,'¿ Cuando son datos personales referentes a ideología, creencias o religión, se solicita el consentimiento expreso y por escrito del afectado?','Deberá advertir previamente a la prestación del consentimiento por parte del interesado de los derechos que tiene sobre sus datos personales si tienen que ver sobre ideología, creencias o religión a no prestar el consentimiento, además este consentimiento debe ser prestado de forma expresa y por escrito.',9),
(26,'¿ Los datos de carácter personal relativos a la salud de las personas son tratados de acuerdo con los dispuesto en la legislación estatal o autonómica sobre sanidad ?','Deberá tratar esos datos según lo dispuesto en la legislación estatal o autonómico sobre sanidad.',10),
(27,'¿ El responsable del fichero o el encargado del tratamiento ha adoptado las medidas técnicas y organizativas que garanticen la seguridad de los datos de carácter personal evitando su alteración, pérdida o tratamiento o acceso no autorizado?','El responsable del fichero o el encargado del tratamiento ha de adoptar todas las medidas necesarias ya sean técnicas u organizativas que garanticen la seguridad de los datos de carácter personal para evitar su alteración, pérdida o tratamiento o acceso no autorizado.',11),
(28,'¿El responsable del fichero y los intervinientes en el tratamiento de los datos guardan secreto profesional sobre los mismos y cumplen el deber de guardar los datos?','El responsable del fichero y los intervinientes en el tratamiento de los datos deben guardar secreto profesional sobre los mismos y cumplir el deber de guardar los datos.',12),
(29,'¿ Cuando se produce una cesión de datos es para el cumplimiento de fines directamente relacionados con las funciones legítimas del cedente y del cesionario?','Está prohibido realizar la cesión de datos si no es para el cumplimiento de los fines directamente relacionados con las funciones legítimas, si no lo hace así esta práctica puede suponer sanción por parte de la Agencia de Protección de Datos con el coste económico y el desprestigio que conlleva para su empresa.',13),
(30,'¿ Cuando se produce una cesión de datos se solicita el previo consentimiento del afectado?','Si el consentimiento del afectado no se obtiene o no se puede garantizar que sea inequívoco no puede tratar los datos personales del interesado hasta que no se obtenga el consentimiento inequívoco de este.',13),
(31,'¿Se impide que se produzca un acceso a los datos personales por cuenta de terceros?','A veces el tratamiento de los datos no lo realiza la misma empresa sino que lo realiza une empresa especializada en el tratamiento de datos.Si se produce un acceso a los datos por cuenta de terceros habrá que cumplir otros requisitos adicionales para garantizar la seguridad, la integridad y el acceso a los datos.',13),
(32,'¿ Ha sido regulada por un contrato la realización de tratamiento por cuenta de terceros?','Si no ha formalizado la realización de tratamiento por cuenta de terceros por medio de un contrato debería hacerlo para cumplir los requisitos de la LOPD, si no lo hace así esta práctica puede suponer una sanción por parte de la Agencia de Protección de  Datos con el coste económico y el desprestigio que conlleva para su empresa.',13),
(33,'¿ Se especifica en el citado contrato expresamente que el encargado del tratamiento únicamente tratará los datos conforme a las instrucciones del responsable del tratamiento y que no los aplicará o utilizará con fin distinto al que  figure en dicho contrato, ni lo comunicará ni siquiera para su conservación a otras personas?','Para cumplir la legislación de protección de datos en el contrato deben figurar los siguientes términos:el encargado del tratamiento solo debe tratar los datos conforme a las instrucciones del responsable del tratamiento,el encargado del tratamiento no aplicará o utilizará los datos con un fin distinto al que figure en dicho contrato, ni lo comunicará para su conservación a otras personas.',13),
(34,'¿ Cuando se cumple la prestación contractual, los datos de carácter personal y los soportes o documentos en los que consta algún datos de carácter personal son destruidos o devueltos al responsable del tratamiento?','Si no lo hace, una vez que se ha cumplido la prestación especificada en el contrato los datos de carácter personal o los soportes en los que consta algún dato de carácter personal deben ser destruidos o devueltos al responsable del tratamiento,de lo contrario esta práctica puede suponer una sanción por parte de la Agencia de Protección de Datos con el coste económico y el desprestigio que conlleva para su empresa.',13),
(35,'¿Todos los ficheros o tratamiento de datos adoptan como mínimo las medidas de seguridad de nivel básico?','Como mínimo todos los ficheros o tratamiento de datos que implemente tienen que cumplir\\\\r\\\\nlas medidas de seguridad de nivel básico.',14),
(36,'¿Ha implementado medidas de nivel medio en los siguientes ficheros o tratamientos de datos de carácter personal?,los relativos a la comisión de infracciones administrativas o penales,aquellos cuyo funcionamiento se rija por el art. 29 LOPD,aquellos de los que sean responsables las Administraciones tributarias y se relacionen con el ejercicio de sus potestades tributarias,\\naquellos de los que sean responsables las entidades financieras para finalidades relacionadas con la prestación de servicios financieros,\\naquellos de los que sean responsables las Entidades Gestoras y Servicios Comunes de la Seguridad Social y se relacionen con el ejercicio de sus competencias,\\naquellos de los que sean responsables las Mutuas de accidentes de trabajo y enfermedades profesionales de la SS,\\naquellos que contengan un conjunto de datos de carácter personal que ofrezcan una definición de las características o de la personalidad de los ciudadanos y que permitan evaluar determinados aspectos de la personalidad o del comportamiento de los mismos.','Aparte de las medidas de seguridad de nivel básico en el caso de estos ficheros debe implementar las medidas de nivel medio.',15),
(37,'¿Ha implementado medidas de nivel medio en los siguientes ficheros o tratamientos de datos de carácter personal?,los que se refieren a datos de ideología, afiliación sindical, religión, creencias, origen racial, salud o vida sexual,los que se refieren a datos recabados para fines policiales sin consentimiento de las personas afectadas,\\na aquellos que contengan datos derivados de actos de violencia de género.','Aparte de las medidas de seguridad de nivel básico en el caso de estos ficheros debe implementar las medidas de nivel medio.',15),
(38,'¿En el caso de ficheros de los que sean responsables los operadores que presten servicios de comunicaciones electrónicas disponibles al público o exploten redes públicas de comunicaciones electrónicas respecto a los datos de tráfico o de localización se aplican las medidas de seguridad de nivel básico, medio y la medida de seguridad de nivel alto de registro de accesos del art. 103 del Reglamento de Protección de Datos?','Aparte de las medidas de seguridad de nivel básico en el caso de estos ficheros debe implementar las medidas de nivel básico y medio a los ficheros y alto al registro de accesos.',16),
(39,'¿Realiza la implantación de las medidas de nivel básico cuando se da el caso de que los ficheros sean de datos de ideología, afiliación sindical, religión, creencias, origen racial, salud o vida sexual? y,los datos se utilicen con la única finalidad de realizar una transferencia dineraria a las entidades de las que los afectados sean asociados o miembros, se trate de ficheros o tratamientos no automatizados en los que de forma incidental o accesoria se contengan aquellos datos sin guardar relación con su finalidad.','El caso de estos ficheros y solo cuando se den las dos condiciones, que se utilicen con la única finalidad de realizar una transferencia dineraria a las entidades de las que son miembros y se trate de ficheros o tratamientos se trate de ficheros o tratamientos no automatizados que de forma incidental o accesoria se contengan aquellos datos sin guardar relación con su finalidad debe implementar las medidas de nivel básico.',14),
(40,'¿ Si son datos relativos a la salud referentes exclusivamente al grado de discapacidad o la simple declaración de esta condición de incapacidad o invalidez con motivo del cumplimiento de los deberes públicos se implementan medidas de seguridad de nivel bá','En el caso de estos ficheros y en este caso es suficiente con implementar las medidas de nivel básico.',14),
(41,'¿Ha creado como responsable del fichero un documento de seguridad?','El responsable del fichero debe crear un documento de seguridad mediante el cual se elabore e implante la normativa de seguridad.',17),
(42,'¿Ha elaborado e implantado la normativa de seguridad mediante este documento?','Deberá utilizar el documento de seguridad para elaborar e implantar la normativa de seguridad, así se protegerán los datos personales que son sometidos a tratamiento en su entidad.',17),
(43,'¿ El documento de seguridad elaborado establece el ámbito de aplicación del documento especificando detalladamente los recursos protegidos?','El documento de seguridad debe especificar los recursos que deben ser protegidos en su ámbito de aplicación, los archivos, sistemas, etc. que contienen datos personales para ser protegidos y de que forma han de ser protegidos.',17),
(44,'¿ El documento de seguridad elaborado establece las medidas, normas, procedimientos, reglas y estándares que garanticen el nivel de seguridad exigido en el Reglamento?','En el documento de seguridad se debe establecer las medidas, normas, procedimiento, reglas y estándares que garanticen el nivel de seguridad exigido, que puede ser básico, medio o alto dependiendo del tipo de datos a tratar.',17),
(45,'¿ El documento de seguridad elaborado establece la funciones y obligaciones del personal?','Una parte importante del documento de seguridad se refiere a las funciones y obligaciones del personal que trabaja en la empresa y su delimita su relación con los datos personales.',17),
(46,'¿ El documento de seguridad elaborado establece la estructura de los ficheros con datos de carácter personal y descripción de los sistemas de información que los tratan?','El documento de seguridad debe establecer la estructura de los ficheros con datos de carácter personal NPreguntasCreate.add(new NPreguntas( por ejemplo nóminas, recursos humanos) y la descripción de los sistemas de información NPreguntasCreate.add(new NPreguntas(conjunto de ficheros, tratamientos, programas, soportes y en su caso equipos empleados para el tratamiento de datos de carácter personal).',17),
(47,'¿ El documento de seguridad elaborado establece un procedimiento de notificación, gestión y respuesta ante las incidencias?','Las incidencias son circunstancias que afectan a los datos personales que son tratados en la empresa y que afecten o puedan afectar a la seguridad de los datos personales, el documento de seguridad debe establecer un procedimiento para notificar, gestionar y responder a las incidencias.',17),
(48,'¿ El documento de seguridad elaborado establece los procedimientos de realización de copias de respaldo y de recuperación de los datos?','Los datos personales deben ser protegidos mediante copias de respaldo por si una incidencia afecte a su seguridad y si se pierden o dañan de laguna manera el procedimiento de recuperación de datos debe garantizar su completa recuperación.',17),
(49,'¿ El documento de seguridad elaborado se mantiene en todo momento actualizado y es revisado cuando se producen cambios relevantes en el sistema de información o la organización del mismo?','El documento de seguridad no es estático, se elabora y no se hace mas, sino que cuando se producen cambios en la empresa que afectan a los datos personales debe actualizarse para reflejar la nueva realidad.',17),
(50,'¿  El contenido del documento de seguridad está adecuado a las disposiciones vigentes en materia de seguridad de los datos de carácter personal?','Además el documento de seguridad se ha de adecuar a los cambios que se producen en cuanto a las disposiciones legales vigentes en materia de protección de datos.',17),
(51,'¿ Se han definido y documentado claramente las funciones y obligaciones de cada una de las personas con acceso a los datos de carácter personal y a los sistemas de información ?','datos personales, obligaciones de confidencialidad, utilización de los sistemas informáticos, normas de seguridad, etc.',18),
(52,'¿ El responsable del fichero ha adoptado las medidas necesarias para que el personal conozca las normas de seguridad que afectan al desarrollo de sus funciones y las consecuencias de su incumplimiento?','El responsable del fichero debe informar a todo el personal de las normas de seguridad que afectan al desarrollo de sus funciones y que ocurre en el caso del incumplimiento de las mismas.',18),
(53,'¿Se han definido las funciones de control o autorizaciones delegadas por el responsable del fichero o tratamiento?','Si el responsable del tratamiento realiza funciones de control o autorizaciones delegadas deben de ser definidas en el Documento de Seguridad.',18),
(54,'¿ Contiene este procedimiento un registro en el que se haga constar el tipo de incidencia, el momento en el que se ha producido, la persona que realiza la notificación, a quién se le comunica y los efectos que se hubieren derivado de la misma?','En el procedimiento se debe llevar a cabo un  registro de las incidencias que se han producido, los efectos de las mismas y como se han subsanado.',19),
(55,'¿ Existe una relación actualizada de usuarios que tienen acceso autorizado al sistema de información?','Debe crearse una lista de los usuarios que tienen acceso a los sistemas de información, a que sistemas tienen acceso, etc.',20),
(56,'¿ Se han establecido procedimientos de identificación y autenticación para dicho acceso?','Se debe asegurar que los procedimientos de identificación y autenticación permitan identificar a esos usuarios unívocamente.',20),
(57,'¿  Existe un procedimiento de asignación, distribución y almacenamiento de contraseñas que garantice su confidencialidad e integridad?','Se debe gestionar un procedimiento que permita la asignación, distribución y almacenamiento de contraseñas que garantice que solo las personas autorizadas puedan acceder a estas.',20),
(58,'¿ Se cambian las contraseñas con periodicidad?','Para preservar la seguridad de los datos personales las contraseñas se deben cambiar periódicamente.',20),
(59,'¿ Se almacenan de forma inteligible mientras están vigentes ?','Las contraseñas debe almacenarse de manera que solo las personas autorizadas puedan tener acceso a ellas quedando ocultas o inaccesibles para el resto.',20),
(60,'¿ Los usuarios solo tienen acceso a los datos y recursos que precisen para el desarrollo de sus funciones?','Mediante esta política los usuarios solo acceden a los datos estrictamente imprescindibles para el desarrollo de sus funciones.',21),
(61,'¿ El responsable del fichero ha establecido mecanismos para evitar que un usuario pueda acceder a datos o recursos con derechos distintos la los autorizados?','Mediante políticas de seguridad se puede impedir el acceso de usuarios en datos o recursos distintos a los autorizados, por ejemplo mediante claves, tarjetas, identificación biométrica, estancias cerradas con llave o tarjeta electrónica,etc.',21),
(62,'¿El personal ajeno al responsable del fichero que tiene acceso a los recursos está sometido a las mismas condiciones y obligaciones que el personal propio?','Todo el personal debe cumplir las normas de seguridad de protección de datos personales.',21),
(63,'¿ Los soportes informáticos y documentos que contienen datos de carácter personal  permiten identificar el tipo de información que contienen, pueden ser inventariados y se pueden almacenar en un lugar con acceso restringido al personal autorizado?','Los soportes informáticos y documentos que contienen datos de carácter personal deben estar etiquetados de manera que se pueda identificar el tipo de información que contienen, así pueden ser inventariados y deben ser almacenados en un lugar con acceso restringido.',22),
(64,'¿ El responsable del fichero es el único que autoriza la salida de soportes informáticos o documentos que contienen datos de carácter personal?','El responsable del fichero es el único que puede autorizar la salida de soportes informáticos que contienen datos de carácter personal.',22),
(65,'¿Al desechar cualquier documento o soporte que contenga datos de carácter personal se procede a su destrucción o borrado evitando el acceso a la información contenida en el mismo o su recuperación posterior?','Debe destruir o borrar cualquier documento o soporte que contenga datos de carácter personal evitando el acceso a la información contenida en el mismo o su recuperación posterior.',22),
(66,'¿ Los soportes con datos de carácter personal especialmente sensibles se identifican mediante un sistema de etiquetado comprensible y con significado que permitan identificar su contenido a los usuarios autorizados y dificultar su identificación para el resto de personas?.','Debe identificar los soportes con datos de carácter personal especialmente sensibles mediante un sistema de etiquetado comprensible y con significado que permita identificar su contenido a los usuarios autorizados  y dificultar su identificación para el resto de personas.',22),
(67,'¿ Verifica el responsable del fichero la definición y correcta aplicación de los procedimientos de realización de copias de respaldo ?','El responsable del fichero es el que debe verificar como se definen y se aplican los procedimientos de realización de copias de respaldo, cada seis meses, por ejemplo en discos duros, Cds, DVDs, flash, Blu-Ray, etc.',23),
(68,'¿ Los procedimientos establecidos para la realización de copias de respaldo y recuperación de datos garantizan su reconstrucción al estado en el que se encontraban al tiempo de producirse la pérdida o destrucción?','Cuando se produce una incidencia que afecta a los datos y los datos se han perdido o destruido, el sistema de realización de copias de seguridad y respaldo debe garantizar la recuperación de los datos al estado en que se encontraban cuando se produjo la pérdida o destrucción.',23),
(69,'¿ Se realizan copias de respaldo, al menos semanalmente, salvo que en dicho período no se hubiera producido ninguna actualización de los datos ?','Como mínimo hay que realizar copias de respaldo de los datos personales en el intervalo de una semana, esto es en el caso de que en el intervalo de una semana se haya producido una actualización de los datos, si no se ha producido no es necesario.',23),
(70,'¿ Contiene el documento de seguridad además de lo anterior la identificación del responsable o responsables de seguridad?','El documento de Seguridad debe identificar al responsable/s de seguridad.',24),
(71,'¿ Contiene el documento de seguridad los controles periódicos que deben realizarse para verificar el cumplimiento de los dispuesto en el propio documento?','El documento de seguridad debe contener los controles periódicos que deben realizarse para verificar el cumplimiento de los dispuesto en el propio documento.',24),
(72,'¿ Contiene el documento de seguridad además las medidas que hay que adoptar cuando un soporte va a ser desechado o reutilizado?','El documento de seguridad debe contener además las medidas que se deben doptar cuando un soporte va a ser desechado o reutilizado.',24),
(73,'¿ Ha designado el Responsable del Fichero uno o varios Responsables de Seguridad que coordinan y controlan las medidas definidas en el documento de seguridad?','El responsable del fichero debe designar uno o varios Responsables de Seguridad que coordinen y controlen las medidas definidas en el documento de seguridad.',25),
(74,'¿ Se ha sometido a los sistemas de información e instalaciones de tratamiento de datos a una auditoría interna o externa que verifique el cumplimiento del Reglamento, procedimientos e instrucciones vigentes en materia de seguridad?','Cada dos años hay que realizar una auditoría de cumplimiento de la normativa de protección de datos.',26),
(75,'¿ Se ha realizado la auditoría al menos cada dos años?','La auditoría como mínimo hay que realizarla cada dos años.',26),
(76,'¿ El responsable de seguridad que corresponda ha analizado los informes de auditoría?','Los informes de auditoría deben ser analizados por el Responsable de Seguridad para ver que problemas han habido y como se han solucionado.',26),
(77,'¿Se realiza una auditoría extraordinaria cada vez que realizan modificaciones sustanciales en el sistema de información que puedan repercutir en el cumplimiento de las medidas de seguridad implantadas?','Debe realizarse una  auditoría extraordinaria cada vez que realizan modificaciones sustanciales en el sistema de información que puedan repercutir en el cumplimiento de las medidas de seguridad implantadas.',26),
(78,'¿ El responsable de seguridad ha remitido las conclusiones de la auditoría al responsable del fichero para que adopte las medidas correctoras adecuadas?','El Responsable de Seguridad debe elaborar un informe con las conclusiones del análisis que entregará al Responsable del fichero para que adopte las medidas necesarias para corregir los fallos encontrados.',26),
(79,'¿ La documentación sobre auditorías y sus informes ha quedado a disposición de la AEPD?','Deben guardarse los documentos que se hayan generado en relación con las auditorías y sus informes para que estén a disposición de la AEPD.',26),
(80,'¿ El responsable del fichero ha establecido un mecanismo que permita la identificación inequívoca y personalizada de todo aquel usuario que intente acceder al sistema de información y la verificación de que está autorizado?','El responsable del fichero debe establecer mecanismos para permitir la identificación inequívoca y personalizada de todo aquel usuario que intente acceder al sistema de información y la verificación de que está autorizado, por ejemplo mediante contraseñas, identificación biométrica u otros medios.',27),
(81,'¿ Se ha limitado la posibilidad de intentar reiteradamente el acceso no autorizado al sistema de información ?','Normalmente se debe impedir mas de tres intentonas de acceder sin autorización al sistema de información, por ejemplo bloqueando al usuario.',27),
(82,'¿ Solo el personal autorizado en el documento de seguridad tiene acceso a los locales donde se encuentren ubicados los sistemas de información con datos de carácter personal?','Se deben proteger los locales donde se encuantran ubicados los sistemas de información por medio de algún sistema como cerrados con llave, con acceso mediante tarjeta o identificación biométrica.',28),
(83,'¿ Se ha establecido un sistema de registro de entrada de soportes informáticos?','Cada soporte informático que es introducido o creado en el sistema que contenga datos personales debe ser registrado.',29),
(84,'¿ El registro de entrada de soportes informáticos permite conocer el tipo de soporte, la fecha y la hora, el emisor, el número de soportes, el tipo de información que contienen, la forma de envío y la persona responsable de la recepción autorizada debidamente?','El registro de entrada debe contener los siguientes datos como mínimo:tipo de soporte,fecha,hora,emisor,número de soportes,el tipo de información que contienen,la forma de envío del soporte,el responsable de la recepción.',29),
(85,'¿ Se ha establecido un sistema de registro de salida de soportes informáticos?','Cada soporte informático que es sacado del sistema de información que contenga datos personales debe ser registrado.',29),
(86,'¿ El registro de salida de soportes informáticos permite conocer el tipo de soporte, la fecha y la hora, el emisor, el número de soportes, el tipo de información que contienen, la forma de envío y la persona responsable de la entrega autorizada debidamente?','El registro de salida debe contener los siguientes datos como mínimo:tipo de soporte,fecha,hora,emisor,número de soportes,el tipo de información que contienen,la forma de envío del soporte,el responsable de la entrega.',29),
(87,'¿ Si un soporte es desechado o reutilizado se adoptan las medidas para que no se pueda recuperar posteriormente la información almacenada anteriormente en el?','Los soportes, discos duros, Cds, DVDs, etc que contengan  datos personales y haya que desechar o reutilizar deben ser borrados o destruidos de manera que no se pueda recuperar la información que antes contenían.',29),
(88,'¿  Si un soporte es desechado o reutilizado se procede a su baja en el inventario de soportes?','Los soportes desechados o reutilizados deben darse de baja en el inventario de soportes.',29),
(89,'¿ Para los soportes que vayan a salir fuera de los locales por cuestión de tareas de mantenimiento se adoptan las medidas necesarias para impedir cualquier recuperación indebida de la información almacenada en ellos?','Se debe garantizar que si por causa de efectuar reparaciones o cualquier otra razón imprescindible de mantenimiento se vayan a sacar los soportes fuera de los locales nadia pueda recuperar la información que contengan, por ejemplo cifrando la información o por medio de claves o contraseñas.',29),
(90,'Además de lo anterior, ¿ El procedimiento de notificación y gestión de incidencias contiene un registro en el que se hacen constar los procedimientos realizados de recuperación de datos, indicando la persona que ejecutó el proceso, los datos restaurados y, en su caso los datos que han sido necesario grabar manualmente en le proceso de recuperación?','En el ámbito de la notificación y gestión de incidencias debe crearse un registro donde figuren los procedimientos realizados en su caso de recuperación de datos con los siguientes datos:la persona que ejecutó el proceso,los datos restaurados,los datos que han sido necesario grabar manualmente en el proceso de recuperación si ha sido necesario.',30),
(91,'¿ El responsable del fichero autoriza por escrito la ejecución de los procedimientos de recuperación de datos ?','Cada ejecución del procedimiento de recuperación de datos debe ser autorizada por el responsable del fichero.',30),
(92,'¿ Las pruebas que se han realizado previas a la implantación o modificación de los sistemas de información se realizan con datos reales?','Para implantar o modificar los sistemas de información a veces se hacen pruebas, y a veces en ess pruebas se utilizan datos reales, si se utilizan estos datos deben tener el mismo nivel de seguridad que corresponde al nivel del fichero tratado.',31),
(93,'Si las pruebas se realizan con datos reales, ¿se garantiza en estas el nivel de seguridad correspondiente al tipo de fichero tratado?','En las pruebas realizadas si se utilizan datos reales se debe garantizar el nivel de seguridad correspondiente al tipo de fichero tratado.',31),
(94,'¿ Se distribuyen los soportes que tienen datos de carácter personal cifrando los datos o utilizando cualquier otro mecanismo que garantice que dicha información no sea inteligible ni manipulada durante su transporte ?','En este caso se debe de añadir un nivel de seguridad más por medio de cifrado de datos u otros mecanismos que impidan que durante el transporte la información no sea posible de recuperar y que por lo tanto sea tanto inteligible, que no se pueda leer como que no se pueda manipular.',32),
(95,'¿Se evita el tratamiento de datos personales en dispositivos que no permitan su cifrado?','Debe evitar  el tratamiento de datos personales en dispositivos que no permitan su cifrado.',32),
(96,'¿En caso contrario y solamente si es estrictamente necesario se hace constar motivadamente en el documento de seguridad adoptando medidas que tengan en cuenta los riesgos de seguridad para los datos personales?','En caso contrario y solamente si es estrictamente necesario se debe hacer constar motivadamente en el documento de seguridad que se tratan datos personales en dispositivos que no permiten su cifrado, adoptando medidas que tengan en cuenta los riesgos de seguridad para los datos personales.',32),
(97,'¿ Se registra de cada acceso como mínimo la identificación del usuario, la fecha y hora en la que se realizó el acceso, el fichero accedido, el tipo de acceso y si ha sido autorizado o denegado?','Hay que realizar un registro de todos los accesos a los datos personales con los siguientes datos como mínimo:la identificación del usuario,la fecha y la hora en la que se realizó el acceso,el fichero accedido,el tipo de acceso,si ha sido autorizado o no el acceso.',33),
(98,'¿ Se guarda la información que permite identificar el registro accedido en los accesos autorizados?','Se debe de poder identificar a que registro (fichero) se ha accedido en los accesos autorizados.',33),
(99,'¿ El responsable de seguridad competente controla directamente los mecanismos que permiten el registro de los datos detallados en los párrafos anteriores?','Todos estos mecanismos deben ser controlados directamente por el responsable de seguridad.',33),
(100,'¿ Se impide la desactivación de los mecanismos de registro?','Los mecanismos de registro deben de estar protegidos para que no se puedan desactivar(claves o similar).',33),
(101,'¿ Se conservan los datos registrados por un período mínimo de dos años?','Los datos registrados se deben de guardar por lo menos durante dos años.',33),
(102,'¿ El responsable de seguridad competente revisa periódicamente la información de control registrada?','El responsable de Seguridad debe revisar periódicamente la información de control registrada.',33),
(103,'¿El responsable de seguridad competente elabora un informe mensual de las revisiones realizadas y los problemas detectados?','El responsable de Seguridad debe elaborar un informe mensual de las revisiones realizadas y los problemas detectados.',33),
(104,'¿Se conserva una copia de respaldo y de los procedimientos de recuperación de los datos en un lugar diferente de aquel en que se encuentren los equipos informáticos que los tratan cumpliendo las medidas de Seguridad exigidas en el Reglamento?','Para evitar que al haber un incendio u otro problema en los locales donde se almacenan los datos personales y se pierdan o destruyan, las copias de respaldo y sus procedimientos de recuperación deben ser almacenados en un lugar diferente a aquel donde se encuentren los equipos informáticos que los tratan cumpliendo las medidas de Seguridad exigidas en el Reglamento.',34),
(105,'¿ Se realiza la transmisión de datos de carácter personal a través de redes de telecomunicaciones cifrando los datos o utilizando un mecanismo que garantice que la información sea no inteligible ni manipulada por terceros?','La transmisión de datos de carácter personal por medio de redes de comunicaciones debe de ser cifrada o protegida de manera que  no se pueda acceder a ella ni se pueda manipular.',35),
(106,'¿Aplica la normativa de ficheros automatizados en lo relativo al alcance de los ficheros, a niveles de seguridad, al encargado del tratamiento, a prestaciones de servicio sin acceso a datos personales, a delegación de autorizaciones, a régimen de trabajo fuera de los locales del responsable del fichero o encargado del tratamiento, a copias de trabajo de documentos, al documento de seguridad, a funciones y obligaciones del personal, a registro de incidencias, a control de acceso y a gestión de soportes?','En todos estos aspectos sobre protección de datos que aplicar la normativa de ficheros automatizados a los ficheros no automatizados, haciendo las oportunas adaptaciones.',36),
(107,'¿El archivo de los documentos o soportes se realiza según los criterios de su respectiva legislación o si no existen según los que establezca el responsable del fichero, garantizando la correcta conservación de los documentos, la localización y consulta de la información y el ejercicio de los derechos de oposición al tratamiento, acceso, rectificación y cancelación?','Los documentos o soportes que contengan datos personales se deben archivar según los siguientes criterios:o bien se realiza según los criterios de su respectiva legislación,o bien según los que establezca el responsable del fichero, garantizando:la correcta conservación de los documentos,la localización y consulta de la información,y el ejercicio de los derechos de oposición al tratamiento, acceso, rectificación y cancelación.',36),
(108,'¿Los dispositivos de almacenamiento de los documentos disponen de mecanismos que obstaculicen su apertura o si no es posible el responsable del fichero adopta las medidas que impidan el acceso de personas no autorizadas?','Los dispositivos de almacenamiento de los documentos deben disponer de mecanismos que obstaculicen su apertura (cerradura combinación,etc) o si no es posible el responsable del fichero adopta las medidas que impidan el acceso de personas no autorizadas (evitar que determinadas personas entren a determinadas secciones donde están los datos,etc).',36),
(109,'¿La persona que esta al cargo de la documentación cuando no se encuentra archivada la custodia e impide que pueda ser accedida por personas no autorizadas?','Debe haber una persona que se responsabilice de la documentación  cuando no está archivada y debe impedir que otras personas accedan a esta información si no está autorizadas.',36),
(110,'¿Los armarios o archivadores u otros elementos se encuentran en áreas en las que el acceso está protegido con puertas de acceso dotadas de sistemas de apertura mediante llave u otro dispositivo?','Los armarios o archivadores u otros elementos deben encontrarse en áreas en las que el acceso esté protegido con puertas de acceso dotadas de sistemas de apertura mediante llave u otro dispositivo, combinación, identificación biométrica,etc.',38),
(111,'¿Dichas puertas permanecen cerradas cuando no es preciso acceder a los documentos incluidos en el fichero?','Dichas puertas deben permanecer cerradas cuando no es preciso acceder a los documentos incluidos en el fichero.',38),
(112,'¿La copia o reproducción de documentos solo se realiza bajo el control del personal autorizado en el documento de seguridad?','La copia o reproducción de documentos solo se debe realizar bajo el control del personal autorizado en el documento de seguridad',38),
(113,'¿Se procede a la destrucción de las copias o reproducciones desechadas de forma que se evite el acceso a la información contenida en las mismas o su recuperación posterior?','Se debe proceder a la destrucción de las copias o reproducciones desechadas de forma que se evite el acceso a la información contenida en las mismas o su recuperación posterior',38),
(114,'¿Se limita el acceso a la documentación exclusivamente al personal autorizado?','Se debe limitar el acceso a la documentación exclusivamente al personal autorizado.',38),
(115,'¿Se establecen mecanismos que permiten identificar los accesos realizados en caso de documentos que puedan ser utilizados por varios usuarios?','Se deben establecer mecanismos que permiten identificar los accesos realizados en caso de documentos que puedan ser utilizados por varios usuarios ( registro de acceso, combinación,etc).',38),
(116,'¿El acceso de personas no autorizadas queda adecuadamente registrado de acuerdo con un procedimiento establecido en el documento de seguridad?.','El acceso de personas no autorizadas debe quedar adecuadamente registrado y se debe elaborar para ello previamente un procedimiento que se plasmará en el documento de seguridad',38),
(117,'¿Si se produce el traslado físico de la documentación contenida en un fichero se adoptan medidas dirigidas a impedir el acceso o manipulación de la información objeto de traslado?','Al producirse el traslado físico de la documentación contenida en un fichero deben adoptarse medidas dirigidas a impedir el acceso o manipulación de la información objeto de traslado, cerrado con llave, combinación,etc.',38),
(118,'¿Permite el acceso a los datos personales de las personas fallecidas y, en su caso, su rectificación o supresión a las personas vinculadas al fallecido por razones familiares o de hecho así como sus Herederos?.','Debe permitir el acceso a los datos personales de las personas fallecidas y, en su caso, su rectificación o supresión a las personas vinculadas al fallecido por razones familiares o de hecho así como sus Herederos.',39),
(119,'¿Impide el acceso a los datos personales de las personas fallecidas y, en su caso, su rectificación o supresión a las personas vinculadas al fallecido por razones familiares o de hecho así como sus Herederos cuando la persona fallecida lo hubiese prohibido expresamente o así lo establezca una ley?.','Debe impedir el acceso a los datos personales de las personas fallecidas y, en su caso, su rectificación o supresión a las personas vinculadas al fallecido por razones familiares o de hecho así como sus Herederos cuando la persona fallecida lo hubiese prohibido expresamente o así lo establezca una ley.',39),
(120,'¿Permite el acceso a los datos personales de las personas fallecidas y, en su caso, su rectificación o supresión a las personas o instituciones a las que el fallecido hubiese designado expresamente?.','Debe permitir el acceso a los datos personales de las personas fallecidas y, en su caso, su rectificación o supresión a las personas o instituciones a las que el fallecido hubiese designado expresamente?.',39),
(121,'¿Permite el acceso a los datos personales de las personas fallecidas que son menores y, en su caso, su rectificación o supresión a sus representantes legales o, en el marco de sus competencias, por el Ministerio Fiscal?.','Debe permitir el acceso a los datos personales de las personas fallecidas que son menores y, en su caso, su rectificación o supresión a sus representantes legales o, en el marco de sus competencias, por el Ministerio Fiscal',39),
(122,'¿Permite el acceso a los datos personales de las personas fallecidas que son discapacitados y, en su caso, su rectificación o supresión a sus representantes legales o, en el marco de sus competencias, por el Ministerio Fiscal o quienes hubiesen sido designados para el ejercicio de funciones de apoyo, si tales facultades se entendieran comprendidas en las medidas de apoyo prestadas por el designado?.','Debe permitir el acceso a los datos personales de las personas fallecidas que son discapacitados y, en su caso, su rectificación o supresión a sus representantes legales o, en el marco de sus competencias, por el Ministerio Fiscal o quienes hubiesen sido designados para el ejercicio de funciones de apoyo, si tales facultades se entendieran comprendidas en las medidas de apoyo prestadas por el designado.',39),
(123,'¿Impide el acceso a los datos personales de las personas fallecidas y, en su caso, su rectificación o supresión a las personas vinculadas al fallecido por razones familiares o de hecho así como sus Herederos cuando la persona fallecida lo hubiese prohibido expresamente o así lo establezca una ley?.','Debe impedir el acceso a los datos personales de las personas fallecidas y, en su caso, su rectificación o supresión a las personas vinculadas al fallecido por razones familiares o de hecho así como sus Herederos cuando la persona fallecida lo hubiese prohibido expresamente o así lo establezca una ley.',39),
(124,'¿ha  adoptado todas las medidas razonables para que se supriman o rectifiquen sin dilación, la inexactitud de los datos personales habiendo sido obtenidos por el responsable directamente del afectado o hubiesen sido obtenidos por el responsable de un mediador o intermediario en caso de que las normas aplicables al sector de actividad al que pertenezca el responsable del tratamiento establecieran la posibilidad de intervención de un intermediario o mediador que recoja en nombre propio los datos de los afectados para su transmisión al responsable o fuesen sometidos a tratamiento por el responsable por haberlos recibido de otro responsable en virtud del ejercicio por el afectado del derecho a la portabilidad o fuesen obtenidos de un registro público por el responsable.?','Debe adoptar todas las medidas razonables para que se supriman o rectifiquen sin dilación, la inexactitud de los datos personales habiendo sido obtenidos por el responsable directamente del afectado o hubiesen sido obtenidos por el responsable de un mediador o intermediario en caso de que las normas aplicables al sector de actividad al que pertenezca el responsable del tratamiento establecieran la posibilidad de intervención de un intermediario o mediador que recoja en nombre propio los datos de los afectados para su transmisión al responsable o fuesen sometidos a tratamiento por el responsable por haberlos recibido de otro responsable en virtud del ejercicio por el afectado del derecho a la portabilidad o fuesen obtenidos de un registro público por el responsable. En caso contrario se expone a ser multado con multas importantes por no hacerlo.',1),
(125,'¿Ha cumplido el deber de confidencialidad garantizando una seguridad adecuada de los datos personales, incluida la protección contra el tratamiento no autorizado o ilícito y contra su pérdida, destrucción o daño accidental, mediante la aplicación de medidas técnicas u organizativas apropiadas de integridad y confidencialidad?','Debe cumplr el deber de confidencialidad garantizando una seguridad adecuada de los datos personales, incluida la protección contra el tratamiento no autorizado o ilícito y contra su pérdida, destrucción o daño accidental, mediante la aplicación de medidas técnicas u organizativas apropiadas de integridad y confidencialidad.',1),
(126,'¿Cuando se pretenda fundar el tratamiento de los datos en el consentimiento del afectado para una pluralidad de finalidades consta de manera específica e inequívoca que dicho consentimiento se otorga para todas ellas?','Debe constar de manera específica e inequívoca que dicho consentimiento se otorga para todas las finalidades.',1),
(127,'¿El tratamiento de los datos de una persona solo se funda en su consentimiento cuando es mayor de catorce años?','Si es menor de 14 años no vale su consentimiento solamente , el tratamiento de los datos de una persona solo se funda en su consentimiento cuando es mayor de catorce años.',1),
(128,'¿Obtiene el consentimiento mediante la asistencia de los titulares de la patria potestad o tutela para la celebración del acto o negocio jurídico en cuyo contexto se recaba el consentimiento para el tratamiento en los supuesto en los que la ley lo exije?','En los casos que la ley lo exige debe obtener el consentimiento mediante la asistencia de los titulares de la patria potestad o tutela para la celebración del acto o negocio jurídico en cuyo contexto se recaba el consentimiento para el tratamiento.',3),
(129,'¿El tratamiento de datos personales en cumplimiento de una obligación legal se realiza porque existe una obligación legal exigible y aplicable al responsable el tratamiento porque así lo prevee una norma de Derecho de la Unión Europea o una norma con rango de ley?','Cuando hay una obligación legal de tratamiento debe realizarse solamente porque existe una obligación legal exigible y aplicable al responsable el tratamiento porque así lo prevee una norma de Derecho de la Unión Europea o una norma con rango de ley.',54),
(130,'¿El tratamiento de datos personales en cumplimiento de en interés público o en el ejercicio de poderes públicos conferidos al responsable fundada en el cumplimiento de una misión que deriva de una competencia atribuida por una norma con rango de ley?','Solamente cuando atribuya esa competencia una norma con rango de ley debe hacerse el tratamiento de datos personales en cumplimiento de en interés público o en el ejercicio de poderes públicos conferidos al responsable fundada en el cumplimiento de una misión.',54),
(131,'¿Se sirve de mas que el consentimiento del afectado para levantar la prohibición del tratamiento de datos cuya finalidad principal sea identificar su ideología, afiliación sindical, religión, orientación sexual, creencias u origen racial o étnico cuando el Derecho de la Unión o de los Estados miembros establezca que está prohibido el tratamiento de datos personales que revelen el origen étnico o racial, las opiniones políticas, las convicciones religiosas o filosóficas, o la afiliación sindical, y el tratamiento de datos genéticos, datos biométricos dirigidos a identificar de manera unívoca a una persona física, datos relativos a la salud o datos relativos a la vida sexual o las orientación sexuales de una persona física?','Para levantar la prohibición del tratamiento de datos cuya finalidad principal sea identificar su ideología, afiliación sindical, religión, orientación sexual, creencias u origen racial o étnico cuando el Derecho de la Unión o de los Estados miembros establezca que está prohibido el tratamiento de datos personales que revelen el origen étnico o racial, las opiniones políticas, las convicciones religiosas o filosóficas, o la afiliación sindical, y el tratamiento de datos genéticos, datos biométricos dirigidos a identificar de manera unívoca a una persona física, datos relativos a la salud o datos relativos a la vida sexual o las orientación sexuales de una persona física, el consentimiento del afectado no es suficiente, tiene que haber una norma que avale este tratamiento.',54),
(132,'¿Realiza el tratamiento de datos en el ámbito de la salud cuando lo ampare una norma con rango de ley y así lo exija la gestión de los sistemas y servicios de asistencia sanitaria y social, pública y privada, o la ejecución de un contrato de seguro del que el afectado sea parte?','Para realizar el tratamiento de datos en el ámbito de la salud debe ampararlo una norma con rango de ley y así debe exigirlo la gestión de los sistemas y servicios de asistencia sanitaria y social, pública y privada, o la ejecución de un contrato de seguro del que el afectado sea parte.',10),
(133,'¿Realiza el tratamiento de datos personales relativos a condenas e infracciones penales, así como a procedimientos y medidas cautelares y de seguridad conexas, para fines distintos de los de prevención, investigación, detección o enjuiciamiento de infracciones penales o de ejecución de sanciones penales, cuando se encuentra amparado en una norma de Derecho de la Unión, en la L.O.P.D. o en otras normas de rango legal?','Solo se puede realizar el tratamiento de datos personales relativos a condenas e infracciones penales, así como a procedimientos y medidas cautelares y de seguridad conexas, para fines de prevención, investigación, detección o enjuiciamiento de infracciones penales o de ejecución de sanciones penales, y solo cuando se encuentra amparado en una norma de Derecho de la Unión, en la L.O.P.D. o en otras normas de rango legal.',54),
(134,'¿Cuando los datos personales sean obtenidos del afectado da cumplimiento al deber de información facilitando al afectado la información básica de la identidad del responsable del tratamiento y de su representante, en su caso, la finalidad del tratamiento, la posibilidad de ejercer los derechos de acceso del interesado, derecho de rectificación, derecho de supresión («el derecho al olvido»), derecho a la limitación del tratamiento, obligación de notificación relativa a la rectificación o supresión de datos personales o la limitación del tratamiento, derecho a la portabilidad de los datos, derecho de oposición o derecho a no ser objeto de una decisión basada únicamente en el tratamiento automatizado, incluida la elaboración de perfiles?','Si los datos personales son obtenidos del afectado dando cumplimiento al deber de información debe facilitarse al afectado la información básica de la identidad del responsable del tratamiento y de su representante, en su caso, la finalidad del tratamiento, la posibilidad de ejercer los derechos de acceso del interesado, derecho de rectificación, derecho de supresión («el derecho al olvido»), derecho a la limitación del tratamiento, obligación de notificación relativa a la rectificación o supresión de datos personales o la limitación del tratamiento, derecho a la portabilidad de los datos, derecho de oposición o derecho a no ser objeto de una decisión basada únicamente en el tratamiento automatizado, incluida la elaboración de perfiles.',3),
(135,'¿Cuando los datos personales no son obtenidos del afectado facilita a aquel la información  básica de la identidad del responsable del tratamiento y de su representante, en su caso, la finalidad del tratamiento, la posibilidad de ejercer los derechos de acceso del interesado, derecho de rectificación, derecho de supresión («el derecho al olvido»), derecho a la limitación del tratamiento, obligación de notificación relativa a la rectificación o supresión de datos personales o la limitación del tratamiento, derecho a la portabilidad de los datos, derecho de oposición o derecho a no ser objeto de una decisión basada únicamente en el tratamiento automatizado, incluida la elaboración de perfiles, las categorías de datos objeto de tratamiento y las fuentes de las que procedieran los datos y además indicándole una dirección electrónica u otro medio que permita acceder de forma sencilla e inmediata a la restante información?.','Si los datos personales no son obtenidos del afectado debe facilitar a aquel la información  básica de la identidad del responsable del tratamiento y de su representante, en su caso, la finalidad del tratamiento, la posibilidad de ejercer los derechos de acceso del interesado, derecho de rectificación, derecho de supresión («el derecho al olvido»), derecho a la limitación del tratamiento, obligación de notificación relativa a la rectificación o supresión de datos personales o la limitación del tratamiento, derecho a la portabilidad de los datos, derecho de oposición o derecho a no ser objeto de una decisión basada únicamente en el tratamiento automatizado, incluida la elaboración de perfiles, las categorías de datos objeto de tratamiento y las fuentes de las que procedieran los datos y además indicándole una dirección electrónica u otro medio que permita acceder de forma sencilla e inmediata a la restante información.',3),
(136,'¿Informa al afectado sobre los medios a su disposición para ejercer los derechos que le corresponden?','Debe informar al afectado sobre los medios a su disposición para ejercer los derechos que le corresponden',3),
(137,'¿Los medios a disposición del afectado para ejercer sus derechos son fácilmente accesibles?','Los medios a disposición del afectado para ejercer sus derechos deben ser fácilmente accesibles para que pueda ejercer sus derechos.',3),
(138,'¿Admite el ejercicio del derecho cuando el afectado opte por otro medio para ejercer sus derechos?','Aunque el afectado opte por otros medios para ejercer sus derechos debe admitir el ejercicio de su derecho.',3),
(139,'¿Cuando la ley aplicable a determinado tratamiento establece un régimen especial que afecta al ejercicio de los derechos se está a lo dispuesto en aquellas?','Debe cumplir el régimen especial que establece la ley aplicable a determinado tratamiento  que afecta al ejercicio de los derechos del afectado.ç',54),
(140,'¿Ejercita el derecho de acceso del afectado de acuerdo con el art. 15 del Reglamento Europeo de Protección de Datos?:','Debe revisar el art. 15 del Reglamento Europeo de Protección de Datos para ejercitar el acceso según sus disposiciones.',3),
(141,'¿Si trata una gran cantidad de datos relativos al afectado y este ejercita su derecho de acceso sin especificar si se refiere a todos o a una parte de los datos, solicita, antes de facilitar la información, que el afectado especifique los datos o actividades de tratamiento a los que se refiere la solicitud?','Debe permitir que el afectado antes de facilitar la información,especifique los datos o actividades de tratamiento a los que se refiere la solicitud si se trata una gran cantidad de datos relativos al afectado y este ejercita su derecho de acceso sin especificar si se refiere a todos o a una parte de los datos.',3),
(142,'En el caso de supresión de datos si esta deriva del ejercicio del derecho de oposición ¿conserva los datos identificativos del afectado necesarios con el fin de impedir tratamientos futuros para fines de mercadotecnia directa?','Debe conservar los datos identificativos del afectado necesarios con el fin de impedir tratamientos futuros para fines de mercadotecnia directa en el caso de supresión de datos si esta deriva del ejercicio del derecho de oposición.',7),
(143,'Ejerce el derecho a la limitación del tratamiento de acuerdo con lo establecido en el artículo 18 del Reglamento (UE) 2016/679?','1. El interesado tendrá derecho a obtener del responsable del tratamiento la limitación del tratamiento de los datos cuando se cumpla alguna de las condiciones siguientes: a) el interesado impugne la exactitud de los datos personales, durante un plazo que permita al responsable verificar la exactitud de los mismos; b) el tratamiento sea ilícito y el interesado se oponga a la supresión de los datos personales y solicite en su lugar la limitación de su uso; c) el responsable ya no necesite los datos personales para los fines del tratamiento, pero el interesado los necesite para la formulación, el ejercicio o la defensa de reclamaciones; d) el interesado se haya opuesto al tratamiento en virtud del artículo 21, apartado 1, mientras se verifica si los motivos legítimos del responsable prevalecen sobre los del interesado.  2. Cuando el tratamiento de datos personales se haya limitado en virtud del apartado 1, dichos datos solo podrán ser objeto de tratamiento, con excepción de su conservación, con el consentimiento del interesado o para la formulación, el ejercicio o la defensa de reclamaciones, o con miras a la protección de los derechos de otra persona física o jurídica o por razones de interés público importante de la Unión o de un determinado Estado miembro. 3. Todo interesado que haya obtenido la limitación del tratamiento con arreglo al apartado 1 será informado por el responsable antes del levantamiento de dicha limitación.',1),
(144,'¿Consta claramente en sus sistemas de información que el tratamiento de los datos personales está limitado?','Debe constar claramente en sus sistemas de información que el tratamiento de los datos personales está limitado',1),
(145,'¿El interesado ha recibido los datos personales que le incumban, que haya facilitado a un responsable del tratamiento, en un formato estructurado, de uso común y lectura mecánica en caso de portabilidad del art. 20 del Reglamento (UE) 2016/679?','El interesado debe recibir todos los datos personales que le incumban, que haya facilitado a un responsable del tratamiento, en un formato estructurado, de uso común y lectura mecánica en caso de portabilidad del art. 20 del Reglamento (UE) 2016/679.',3),
(146,'¿Tratan los datos de contacto y en su caso los relativos a la función o puesto que desempeñan las personas físicas que presten servicios en una persona jurídica solamente cuando el tratamiento se refiere únicamente a los datos necesarios para su localización profesional y que la finalidad del tratamiento sea únicamente mantener relaciones de cualquier índole con la persona jurídica en la que el afectado preste sus servicios?','Deben tratar los datos de contacto y en su caso los relativos a la función o puesto que desempeñan las personas físicas que presten servicios en una persona jurídica solamente cuando el tratamiento se refiere únicamente a los datos necesarios para su localización profesional y que la finalidad del tratamiento sea únicamente mantener relaciones de cualquier índole con la persona jurídica en la que el afectado preste sus servicios',1),
(147,'¿Trata los datos personales relativos al incumplimiento de obligaciones dinerarias, financieras o de crédito por sistemas comunes de información crediticia solamente cuando los datos han sido facilitados por el acreedor o por quien actúe por su cuenta o interés, y los datos se refieran a deudas ciertas, vencidas y exigibles, cuya existencia o cuantía no hubiese sido objeto de reclamación administrativa o judicial por el deudor o mediante un procedimiento alternativo de resolución de disputas vinculante entre las partes y que el acreedor haya informado al afectado en el contrato o en el momento de requerir el pago acerca de la posibilidad de inclusión en dichos sistemas, con indicación de aquéllos en los que participe?','Deben tratan los datos de contacto y en su caso los relativos a la función o puesto que desempeñan las personas físicas que presten servicios en una persona jurídica solamente cuando el tratamiento se refiere únicamente a los datos necesarios para su localización profesional y que la finalidad del tratamiento sea únicamente mantener relaciones de cualquier índole con la persona jurídica en la que el afectado preste sus servicios cuando ello se derive de una obligación legal o sea necesario para el ejercicio de sus competencias.',6),
(148,'¿Notifica al afectado la inclusión de tales datos y le informará sobre la posibilidad de ejercitar los derechos establecidos en los artículos 15 a 22 del Reglamento (UE) 2016/679 dentro de los treinta días siguientes a la notificación de la deuda al sistema?','Existe un plazo de notificación obligatorio de 15 días desde la notificación de la deuda para la notificación al afectado la inclusión de tales datos y la información sobre la posibilidad de ejercitar los derechos establecidos en los artículos 15 a 22 del Reglamento (UE) 2016/679',6),
(149,'¿Bloquea los datos durante el plazo de ejercicio de los derechos establecidos en los artículos 15 a 22 del Reglamento (UE) 2016/679?','Mientras el sujeto afectado está ejerciendo los derechos establecidos en los artículos 15 a 22 del Reglamento (UE) 2016/679 los datos personales deben ser bloqueados',6),
(150,'¿Mantiene los datos en el sistema solo mientras persiste el incumplimiento, con el límite máximo de cinco años desde la fecha de vencimiento de la obligación dineraria, financiera o de crédito?','En el caso de una obligación dineraria, financiera o de crédito solo debe mantener los datos en el sistema mientras persista el incumplimiento, con el límite máximo de cinco años desde la fecha de vencimiento.',6),
(151,'¿Los datos referidos a un deudor determinado solamente pueden ser consultados cuando quien consulte el sistema mantuviese una relación contractual con el afectado que implique el abono de una cuantía pecuniaria o este le hubiera solicitado la celebración de un contrato que suponga financiación, pago aplazado o facturación periódica(casos de la legislación de contratos de crédito al consumo y de contratos de crédito inmobiliario)?','En los casos de contratos de crédito al consumo y de contratos de crédito inmobiliario los datos referidos a un deudor determinado solamente pueden ser consultados cuando quien consulte el sistema mantuviese una relación contractual con el afectado que implique el abono de una cuantía pecuniaria o este le hubiera solicitado la celebración de un contrato que suponga financiación, pago aplazado o facturación periódica.',6),
(152,'¿Se efectúan los tratamientos de datos, incluida su comunicación con carácter previo, que pudieran derivarse del desarrollo de cualquier operación de modificación estructural de sociedades o la aportación o transmisión de negocio o de rama de actividad empresarial, siempre que los tratamientos fueran necesarios para el buen fin de la operación y garanticen, cuando proceda, la continuidad en la prestación de los servicios?.','Los tratamientos de datos deben efectuarse, incluida su comunicación con carácter previo, que pudieran derivarse del desarrollo de cualquier operación de modificación estructural de sociedades o la aportación o transmisión de negocio o de rama de actividad empresarial, siempre que los tratamientos fueran necesarios para el buen fin de la operación y garanticen, cuando proceda, la continuidad en la prestación de los servicios',46),
(153,'¿Si la operación de modificación estructural de sociedades o la aportación o transmisión de negocio o de rama de actividad empresarial no llega a concluirse, la entidad cesionaria suprime inmediatamente los datos, sin que sea de aplicación la obligación de bloqueo prevista en esta ley orgánica?','Si la operación no llega a concluirse, la entidad cesionaria debe suprimir inmediatamente los datos, sin que sea de aplicación la obligación de bloqueo.',48),
(154,'¿Capta imágenes de la vía pública en la medida en que resulte imprescindible para preservar la seguridad de las personas y bienes, así como de sus instalaciones?','Solo debe captar imágenes de la vía pública en la medida en que resulte imprescindible para preservar la seguridad de las personas y bienes, así como de sus instalaciones, no con otro objeto u otras funciones.',49),
(155,'¿Los datos son suprimidos en el plazo máximo de un mes desde su captación, salvo cuando son conservados para acreditar la comisión de actos que atenten contra la integridad de personas, bienes o instalaciones?','Los datos deben ser suprimidos en el plazo máximo de un mes desde su captación, salvo conservados para acreditar la comisión de actos que atenten contra la integridad de personas, bienes o instalaciones',49),
(156,'¿Cuando son conservados los datos para acreditar la comisión de actos que atenten contra la integridad de personas, bienes o instalaciones, las imágenes son puestas a disposición de la autoridad competente en un plazo máximo de setenta y dos horas desde que se tuviera conocimiento de la existencia de la grabación?','Cuando son conservados los datos para acreditar la comisión de actos que atenten contra la integridad de personas, bienes o instalaciones, las imágenes deben ser puestas a disposición de la autoridad competente en un plazo máximo de setenta y dos horas desde que se tuviera conocimiento de la existencia de la grabación',49),
(157,'¿Cumple el deber de información del artículo 12 del Reglamento (UE) 2016/679 colocando de un dispositivo informativo en lugar suficientemente visible identificando, al menos, la existencia del tratamiento, la identidad del responsable y la posibilidad de ejercitar los derechos previstos en los artículos 15 a 22 del Reglamento (UE) 2016/679 o también un código de conexión o dirección de internet a esta información?','Debe colocar un cartel u objeto informativo que en lugar suficientemente visible identificando, al menos, la existencia del tratamiento, la identidad del responsable y la posibilidad de ejercitar los derechos previstos en los artículos 15 a 22 del Reglamento (UE) 2016/679 o también un código de conexión o dirección de internet a esta información.',49),
(158,'¿El responsable del tratamiento mantiene a disposición de los afectados la información a la que se refiere el artículo 12 del Reglamento (UE) 2016/679?','El responsable del tratamiento debe mantener a disposición de los afectados la información a la que se refiere el artículo 12 del Reglamento (UE) 2016/679',49),
(159,'¿Cuando un afectado manifieste su deseo de que sus datos no sean tratados para la remisión de comunicaciones comerciales, informa a este de los sistemas de exclusión publicitaria existentes, pudiendo remitirse a la información publicada por la autoridad de control competente?','Debe informar al afectado de de los sistemas de exclusión publicitaria existentes cuando manifieste su deseo de que sus datos no sean tratados para la remisión de comunicaciones comerciales, pudiendo también remitirse a la información publicada por la autoridad de control competente',50),
(160,'¿Si pretende realizar comunicaciones de mercadotecnia directa, consulta previamente los sistemas de exclusión publicitaria que pudieran afectar a su actuación, excluyendo del tratamiento los datos de los afectados que hubieran manifestado su oposición o negativa al mismo?','Para realizar comunicaciones de mercadotecnia directa debe consultar previamente los sistemas de exclusión publicitaria que pudieran afectar a su actuación, y debe excluir del tratamiento los datos de los afectados que hubieran manifestado su oposición o negativa al mismo.',50),
(161,'¿Consulta de los sistemas de exclusión incluidos en la relación publicada por la autoridad de control competente si pretende realizar comunicaciones de mercadotecnia directa en el caso de que los afectados hubieran manifestado su oposición o negativa al mismo?','Debe consultar los sistemas de exclusión incluidos en la relación publicada por la autoridad de control competente si pretende realizar comunicaciones de mercadotecnia directa en el caso de que los afectados hubieran manifestado su oposición o negativa al mismo',50),
(162,'¿El acceso a los datos contenidos en estos sistemas de exclusión quedará limitado exclusivamente a quienes, desarrollen las funciones de control interno y de cumplimiento, o a los encargados del tratamiento que eventualmente se designen a tal efecto?','El acceso a los datos contenidos en estos sistemas de exclusión quedará limitado exclusivamente a quienes, desarrollen las funciones de control interno y de cumplimiento, o a los encargados del tratamiento que eventualmente se designen a tal efecto',50),
(163,'¿Solo se permite el acceso a los datos al personal con funciones de gestión y control de recursos humanos cuando pudiera proceder la adopción de medidas disciplinarias contra un trabajador?','Solo se permite el acceso a los datos al personal con funciones de gestión y control de recursos humanos cuando pudiera proceder la adopción de medidas disciplinarias contra un trabajador',51),
(164,'¿Se adoptan las medidas necesarias para preservar la identidad y garantizar la confidencialidad de los datos correspondientes a las personas afectadas por la información suministrada, especialmente la de la persona que hubiera puesto los hechos en conocimiento de la entidad, en caso de que se hubiera identificado?','Se deben adoptan las medidas necesarias para preservar la identidad y garantizar la confidencialidad de los datos correspondientes a las personas afectadas por la información suministrada, especialmente la de la persona que hubiera puesto los hechos en conocimiento de la entidad, si se hubiera identificado.',51),
(165,'¿Los datos de quien formule la comunicación y de los empleados y terceros se conservan en el sistema de denuncias únicamente durante el tiempo imprescindible para decidir sobre la procedencia de iniciar una investigación sobre los hechos denunciados?','Los datos de quien formule la comunicación y de los empleados y terceros deben ser conservados en el sistema de denuncias únicamente durante el tiempo imprescindible para decidir sobre la procedencia de iniciar una investigación sobre los hechos denunciados',51),
(166,'¿Se procede a la supresión del sistema de denuncias de los datos, transcurridos tres meses desde su introducción salvo que la finalidad de la conservación sea dejar evidencia del funcionamiento del modelo de prevención de la comisión de delitos por la persona jurídica?','Los datos del sistema de denuncias de un afectado se deben a la suprimir del sistema de denuncias, transcurridos tres meses desde su introducción salvo que la finalidad de la conservación sea dejar evidencia del funcionamiento del modelo de prevención de la comisión de delitos por la persona jurídica',51),
(167,'¿Las denuncias a las que no se haya dado curso solo constan de forma anonimizada?','Se debe ocultar la información de datos personales en el caso de las denuncias a las que no se haya dado curso,  se debe hacer una anonimización de los mismos.',51),
(168,'¿Los datos de la Función Estadística Pública, son de aportación estrictamente voluntaria y solo se recogen previo consentimiento expreso de los afectados los datos a los que se refieren los artículos 9 y 10 del Reglamento (UE) 2016/679?','Si se recogen datos de Función Estadística Pública, deben ser recogidos voluntariamente y previo consentimiento expreso de los afectados(artículos 9 y 10 del Reglamento (UE) 2016/679)',52),
(169,'¿Si en el tratamiento de datos relativos a infracciones y sanciones administrativas no se cumple que los responsables de dichos tratamientos son los órganos competentes para la instrucción del procedimiento sancionador, para la declaración de las infracciones o la imposición de las sanciones, el tratamiento se limita a los datos estrictamente necesarios para la finalidad perseguida por aquel los tratamientos de datos referidos a infracciones y sanciones administrativas,  cuentan con el consentimiento del interesado o están autorizados por una norma con rango de ley en la que se regulan, en su caso, garantías adicionales para los derechos y libertades de los afectados?','En el tratamiento de datos relativos a infracciones y sanciones administrativas si los responsables de dichos tratamientos no son los órganos competentes para la instrucción del procedimiento sancionador, para la declaración de las infracciones o la imposición de las sanciones, el tratamiento debe limitarse a los datos estrictamente necesarios para la finalidad perseguida por aquel, los tratamientos de datos referidos a infracciones y sanciones administrativas,  y deben contar con el consentimiento del interesado o están autorizados por una norma con rango de ley en la que se regulan, en su caso, garantías adicionales para los derechos y libertades de los afectados.',53),
(170,'¿Si no se cumple ninguno de los supuestos señalados en los apartados anteriores, los tratamientos de datos referidos a infracciones y sanciones administrativas solo se producen cuando son llevados a cabo por abogados y procuradores y tienen por objeto recoger la información facilitada por sus clientes para el ejercicio de sus funciones?','Si no se cumplen los supuestos anteriores los tratamientos de datos referidos a infracciones y sanciones administrativas solo se deben producir cuando son llevados a cabo por abogados y procuradores y tienen por objeto recoger la información facilitada por sus clientes para el ejercicio de sus funciones.',53),
(171,'¿Los responsables y encargados, teniendo en cuenta los elementos enumerados en los artículos 24 y 25 del Reglamento (UE) 2016/679, han determinado las medidas técnicas y organizativas apropiadas que deben aplicar a fin de garantizar y acreditar que el tratamiento es conforme con el citado reglamento, con la presente ley orgánica, sus normas de desarrollo y la legislación sectorial aplicable?','Los responsables y encargados, (artículos 24 y 25 del Reglamento (UE) 2016/679,) deben determinar las medidas técnicas y organizativas apropiadas que deben aplicar a fin de garantizar y acreditar que el tratamiento es conforme con el citado reglamento, con la presente ley orgánica, sus normas de desarrollo y la legislación sectorial aplicable.',53),
(172,'¿ Mantienen el registro de actividades de tratamiento al que se refiere el artículo 30 del Reglamento (UE) 2016/679 los responsables y encargados del tratamiento o, en su caso, sus representantes excepto que sea de aplicación la excepción prevista en su apartado 5?','Los responsables y encargados del tratamiento o sus representantes deben llevar un registro de actividades de tratamiento (artículo 30 del Reglamento (UE) 2016/679) excepto que sea de aplicación la excepción prevista en su apartado 5).',53),
(173,'¿ El registro, especifica, según sus finalidades, las actividades de tratamiento llevadas a cabo y las demás circunstancias establecidas en el Reglamento (UE) 2016/679?','El registro debe especificar, según sus finalidades, las actividades de tratamiento llevadas a cabo y las demás circunstancias establecidas en el Reglamento (UE) 2016/679',53),
(174,'¿Si el  responsable o el encargado del tratamiento designa un delegado de protección de datos se le comunica cualquier adición, modificación o exclusión en el contenido del registro?','Si el  responsable o el encargado del tratamiento designa un delegado de protección de datos debe comunicarsele cualquier adición, modificación o exclusión en el contenido del registro',41),
(175,'¿Los responsables y encargados del tratamiento han designado un delegado de protección de datos según el art. 34 de la L.O.P.D.?','Los responsables y encargados del tratamiento deben designar un delegado de protección de datos según el art. 34 de la L.O.P.D., (en los supuestos previstos en el artículo 37.1 del Reglamento y también cuando se trate de las entidades del artículo 34 de la L.O.P.D.',41),
(176,'¿En caso de que hayan designado un delegado de protección de datos han comunicado a la AEPD su designaciön en el plazo obligatorio legal de 10 días ?','Deben comunicar a la AEPD la designación de un delegado de protección de datos en el plazo obligatorio legal de 10 días.',41),
(177,'¿La entidad se ha adherido a un código de conducta regulado por la sección 5.a del Capítulo IV del Reglamento (UE) 2016/679?','La sección 5.a del Capítulo IV del Reglamento (UE) 2016/679 establece los códigos de conducta a los que puede adherirse.',44),
(178,'¿Los responsables del tratamiento han informado a la Agencia Española de Protección de Datos o, en su caso, a las autoridades autonómicas de protección de datos, de cualquier transferencia internacional de datos que pretendan llevar a cabo sobre la base de su necesidad para fines relacionados con intereses legítimos imperiosos perseguidos por aquéllos y la concurrencia del resto de los requisitos previstos en el último párrafo del artículo 49.1 del Reglamento (UE) 2016/679?.','Los responsables del tratamiento deben informar a la Agencia Española de Protección de Datos o, en su caso, a las autoridades autonómicas de protección de datos, de cualquier transferencia internacional de datos que pretendan llevar a cabo sobre la base de su necesidad para fines relacionados con intereses legítimos imperiosos perseguidos por aquéllos y la concurrencia del resto de los requisitos previstos en el último párrafo del artículo 49.1 del Reglamento (UE) 2016/679.',8),
(179,'¿Los responsables del tratamiento han informado de la transferencia internacional de datos que pretendan llevar a cabo a los afectados de la transferencia y de los intereses legítimos imperiosos perseguidos previamente a la misma?','Los responsables del tratamiento deben informar de la transferencia internacional de datos que pretendan llevar a cabo a los afectados de la transferencia y de los intereses legítimos imperiosos perseguidos previamente a la misma',8),
(180,'¿Respeta la intimidad de los trabajadores y los empleados públicos en el uso de los dispositivos digitales puestos a su disposición por su empleador?','Debe respetar la intimidad de los trabajadores y los empleados públicos en el uso de los dispositivos digitales puestos a su disposición por su empleador',40),
(181,'¿Solo accede a los contenidos derivados del uso de medios digitales facilitados a los trabajadores a los solos efectos de controlar el cumplimiento de las obligaciones laborales o estatutarias y de garantizar la integridad de dichos dispositivos?','Solo puede acceder a los contenidos derivados del uso de medios digitales facilitados a los trabajadores a los solos efectos de controlar el cumplimiento de las obligaciones laborales o estatutarias y de garantizar la integridad de dichos dispositivos.',40),
(182,'¿Los trabajadores o los empleados públicos de la entidad tienen derecho a la desconexión digital?','Los trabajadores o los empleados públicos de la entidad tienen derecho a la desconexión digital una vez acabada la jornada laboral',40),
(183,'¿Se garantiza a los trabajadores o los empleados públicos de la entidad  fuera del tiempo de trabajo legal o convencionalmente establecido, el respeto de su tiempo de descanso, permisos y vacaciones, así como de su intimidad personal y familiar?','Se debe garantizar a los trabajadores o los empleados públicos de la entidad  fuera del tiempo de trabajo legal o convencionalmente establecido, el respeto de su tiempo de descanso, permisos y vacaciones, así como de su intimidad personal y familiar.',40),
(184,'¿Se garantiza a los trabajadores o los empleados públicos el derecho a la desconexión digital en los supuestos de realización total o parcial del trabajo a distancia así como en el domicilio del empleado vinculado al uso con fines laborales de herramientas tecnológicas?','Se debe garantizar a los trabajadores o los empleados públicos el derecho a la desconexión digital en los supuestos de realización total o parcial del trabajo a distancia así como en el domicilio del empleado vinculado al uso con fines laborales de herramientas tecnológicas.',40),
(185,'¿Se tratan las imágenes obtenidas a través de sistemas de cámaras o videocámaras para el ejercicio de las funciones de control de los trabajadores o los empleados públicos previstas, respectivamente, en el artículo 20.3 del Estatuto de los Trabajadores y en la legislación de función pública, ejerciéndolo dentro de su marco legal y con los límites inherentes al mismo?','Solo deben tratarse las imágenes obtenidas a través de sistemas de cámaras o videocámaras para el ejercicio de las funciones de control de los trabajadores o los empleados públicos previstas, respectivamente, en el artículo 20.3 del Estatuto de los Trabajadores y en la legislación de función pública, ejerciéndolo dentro de su marco legal y con los límites inherentes al mismo.',49),
(186,'¿Se informa con carácter previo, y de forma expresa, clara y concisa, a los trabajadores o los empleados públicos y, en su caso, a sus representantes, acerca de esta medida?','Debe informarse con carácter previo, y de forma expresa, clara y concisa, a los trabajadores o los empleados públicos y, en su caso, a sus representantes, acerca de esta medida.',49),
(187,'¿Se impide la instalación de sistemas de grabación de sonidos o de videovigilancia en lugares destinados al descanso o esparcimiento de los trabajadores o los empleados públicos, tales como vestuarios, aseos, comedores y análogos?','Está terminantemente prohibido la instalación de sistemas de grabación de sonidos o de videovigilancia en lugares destinados al descanso o esparcimiento de los trabajadores o los empleados públicos, tales como vestuarios, aseos, comedores y análogos.',49),
(188,'¿Se tratan los datos obtenidos a través de sistemas de geolocalización para el ejercicio de las funciones de control de los trabajadores o los empleados públicos previstas, respectivamente, en el artículo 20.3 del Estatuto de los Trabajadores y en la legislación de función pública, ejerciéndose  dentro de su marco legal y con los límites inherentes al mismo?','Se deben tratar los datos obtenidos a través de sistemas de geolocalización para el ejercicio de las funciones de control de los trabajadores o los empleados públicos previstas, respectivamente, en el artículo 20.3 del Estatuto de los Trabajadores y en la legislación de función pública, ejerciéndose  dentro de su marco legal y con los límites inherentes al mismo.',49),
(189,'También se les informa acerca del posible ejercicio de los derechos de acceso, rectificación, limitación del tratamiento y supresión?','Se debe informar a los trabajadores del posible ejercicio de los derechos de acceso, rectificación, limitación del tratamiento y supresión',49),
(190,'¿Si desarrollan actividades en las que participen menores de edad garantizan la protección del interés superior del menor y sus derechos fundamentales, especialmente el derecho a la protección de datos personales, en la publicación o difusión de sus datos personales a través de servicios de la sociedad de la información?','Cuando se desarrollan actividades en las que participan menores de edad garantizan la protección del interés superior del menor y sus derechos fundamentales, especialmente el derecho a la protección de datos personales, en la publicación o difusión de sus datos personales a través de servicios de la sociedad de la información.',40),
(191,'¿Si dicha publicación o difusión de los datos de menores fuera a tener lugar a través de servicios de redes sociales o servicios equivalentes cuentan con el consentimiento del menor o sus representantes legales, conforme a lo prescrito en el artículo 7 de la L.O.P.D.?','Si la publicación o difusión de los datos de menores fuera a tener lugar a través de servicios de redes sociales o servicios equivalentes deben contar con el consentimiento del menor o sus representantes legales, conforme a lo prescrito en el artículo 7 de la L.O.P.D.',40);
/*!40000 ALTER TABLE `questions` ENABLE KEYS */;
UNLOCK TABLES;
commit;

--
-- Current Database: `ccpd_enterprises`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `ccpd_enterprises` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;

USE `ccpd_enterprises`;

--
-- Table structure for table `generaldata_treatmentmanager`
--

DROP TABLE IF EXISTS `generaldata_treatmentmanager`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;
CREATE TABLE `generaldata_treatmentmanager` (
  `id_generaldata_treatmentmanager` int(11) NOT NULL DEFAULT 1,
  `enterprise_manager_name` varchar(255) NOT NULL,
  `enterprise_nif` varchar(45) NOT NULL,
  `enterprise_representative_name` varchar(255) NOT NULL,
  `enterprise_representative_surname` varchar(255) NOT NULL,
  `enterprise_representative_nif` varchar(45) NOT NULL,
  `enterprise_address` varchar(255) NOT NULL,
  `enterprise_stateorregion` varchar(128) NOT NULL,
  `enterprise_province` varchar(128) NOT NULL,
  `enterprise_country` varchar(128) NOT NULL,
  `enterprise_location` varchar(128) NOT NULL,
  `enterprise_postalcode` varchar(45) NOT NULL,
  `enterprise_telephone` varchar(45) NOT NULL,
  `enterprise_fax` varchar(45) DEFAULT NULL,
  `enterprise_email` varchar(255) DEFAULT NULL,
  `enterprise_webpage` varchar(45) DEFAULT NULL,
  `id_file` int(11) NOT NULL DEFAULT 1,
  `id_client` int(11) NOT NULL,
  PRIMARY KEY (`id_generaldata_treatmentmanager`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Current Database: `ccpd_lists`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `ccpd_lists` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;

USE `ccpd_lists`;

--
-- Table structure for table `list_cat_desttransint`
--

DROP TABLE IF EXISTS `list_cat_desttransint`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;
CREATE TABLE `list_cat_desttransint` (
  `idcode` int(11) NOT NULL AUTO_INCREMENT,
  `targetinternattrans` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idcode`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `list_cat_desttransint`
--

LOCK TABLES `list_cat_desttransint` WRITE;
/*!40000 ALTER TABLE `list_cat_desttransint` DISABLE KEYS */;
set autocommit=0;
INSERT INTO `list_cat_desttransint` VALUES
(1,'COMPAÑÍAS FILIALES'),
(2,'COMPAÑÍA MATRIZ'),
(3,'COMPAÑÍAS DEL GRUPO'),
(4,'PRESTADORES DE SERVICIO'),
(5,'UNIVERSIDADES Y CENTROS EDUCATIVOS'),
(6,'ÓRGANOS PÚBLICOS DE OTROS ESTADOS'),
(7,'ORGANISMOS INTERNACIONALES'),
(8,'ENTIDADES SANITARIAS'),
(9,'ÓRGANOS JUDICIALES'),
(10,'ENTIDADES FINANCIERAS'),
(11,'DATOS DE PASAJEROS CON DESTINO A LOS ORGANISMOS DE FRONTERAS DE EEUU Y CANADÁ');
/*!40000 ALTER TABLE `list_cat_desttransint` ENABLE KEYS */;
UNLOCK TABLES;
commit;

--
-- Table structure for table `list_cat_targetcessions`
--

DROP TABLE IF EXISTS `list_cat_targetcessions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;
CREATE TABLE `list_cat_targetcessions` (
  `id_fe_cat_targetcessions` int(11) NOT NULL AUTO_INCREMENT,
  `idcode` int(11) NOT NULL,
  `cessionstargetcategories` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_fe_cat_targetcessions`)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `list_cat_targetcessions`
--

LOCK TABLES `list_cat_targetcessions` WRITE;
/*!40000 ALTER TABLE `list_cat_targetcessions` DISABLE KEYS */;
set autocommit=0;
INSERT INTO `list_cat_targetcessions` VALUES
(1,1,'ORGANIZACIONES O PERSONAS DIRECTAMENTE RELACIONADAS CON EL\r\nRESPONSABLE'),
(2,2,'ORGANISMOS DE LA SEGURIDAD SOCIAL'),
(3,3,'REGISTROS PÚBLICOS'),
(4,4,'COLEGIOS PROFESIONALES'),
(5,5,'ADMINISTRACIÓN TRIBUTARIA'),
(6,6,'OTROS ÓRGANOS DE LA AMINISTRACIÓN PÚBLICA'),
(7,7,'COMISIÓN NACIONAL DEL MERCADO DE VALORES'),
(8,8,'COMISIÓN NACIONAL DEL JUEGO'),
(9,9,'NOTARIOS Y PROCURADORES'),
(10,10,'FUERZAS Y CUERPOS DE SEGURIDAD'),
(11,11,'ORGANISMOS DE LA UNIÓN EUROPEA'),
(12,12,'ENTIDADES DEDICADAS AL CUMPLIMIENTO O INCUMPLIMIENTO DE\r\nOBLIGACIONES DINERARIAS'),
(13,13,'BANCOS, CAJAS DE AHORROS Y CAJAS RURALES'),
(14,14,'ENTIDADES ASEGURADORAS'),
(15,15,'OTRAS ENTIDADES FINANCIERAS'),
(16,16,'ENTIDADES SANITARIAS'),
(17,17,'PRESTACIONES DE SERVICIOS DE TELECOMUNICACIONES'),
(18,18,'EMPRESAS DEDICADAS A PUBLICIDAD O MARKETING DIRECTO'),
(19,19,'ASOCIACIONES Y ORGANIZACIONES SIN ÁNIMO DE LUCRO'),
(20,20,'SINDICATOS Y JUNTAS DE PERSONAL'),
(21,21,'ADMINISTRACIÓN CON COMPETENCIA EN LA MATERIA'),
(22,1,'ORGANIZACIONES O PERSONAS DIRECTAMENTE RELACIONADAS CON EL RESPONSABLE'),
(23,2,'ORGANISMOS DE LA SEGURIDAD SOCIAL'),
(24,3,'REGISTROS PÚBLICOS'),
(25,4,'COLEGIOS PROFESIONALES'),
(26,5,'ADMINISTRACIÓN TRIBUTARIA'),
(27,6,'OTROS ÓRGANOS DE LA AMINISTRACIÓN PÚBLICA'),
(28,7,'COMISIÓN NACIONAL DEL MERCADO DE VALORES'),
(29,8,'COMISIÓN NACIONAL DEL JUEGO'),
(30,9,'NOTARIOS Y PROCURADORES'),
(31,10,'FUERZAS Y CUERPOS DE SEGURIDAD'),
(32,11,'ORGANISMOS DE LA UNIÓN EUROPEA'),
(33,12,'ENTIDADES DEDICADAS AL CUMPLIMIENTO O INCUMPLIMIENTO DE OBLIGACIONES DINERARIAS'),
(34,13,'BANCOS, CAJAS DE AHORROS Y CAJAS RURALES'),
(35,14,'ENTIDADES ASEGURADORAS'),
(36,15,'OTRAS ENTIDADES FINANCIERAS'),
(37,16,'ENTIDADES SANITARIAS'),
(38,17,'PRESTACIONES DE SERVICIOS DE TELECOMUNICACIONES'),
(39,18,'EMPRESAS DEDICADAS A PUBLICIDAD O MARKETING DIRECTO'),
(40,19,'ASOCIACIONES Y ORGANIZACIONES SIN ÁNIMO DE LUCRO'),
(41,20,'SINDICATOS Y JUNTAS DE PERSONAL'),
(42,21,'ADMINISTRACIÓN CON COMPETENCIA EN LA MATERIA');
/*!40000 ALTER TABLE `list_cat_targetcessions` ENABLE KEYS */;
UNLOCK TABLES;
commit;

--
-- Table structure for table `list_collectivesorcategories`
--

DROP TABLE IF EXISTS `list_collectivesorcategories`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;
CREATE TABLE `list_collectivesorcategories` (
  `idcollectivesorcategories` int(11) NOT NULL AUTO_INCREMENT,
  `description` varchar(255) NOT NULL,
  PRIMARY KEY (`idcollectivesorcategories`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `list_collectivesorcategories`
--

LOCK TABLES `list_collectivesorcategories` WRITE;
/*!40000 ALTER TABLE `list_collectivesorcategories` DISABLE KEYS */;
set autocommit=0;
INSERT INTO `list_collectivesorcategories` VALUES
(1,'EMPLEADOS'),
(2,'CLIENTES Y USUARIOS'),
(3,'PROVEEDORES'),
(4,'ASOCIADOS O MIEMBROS'),
(5,'PROPIETARIOS O ARRENDATARIOS'),
(6,'PACIENTES'),
(7,'ESTUDIANTES'),
(8,'PERSONAS DE CONTACTO'),
(9,'PADRES O TUTORES'),
(10,'REPRESENTANTE LEGAL'),
(11,'SOLICITANTES'),
(12,'BENEFICIARIOS'),
(13,'CARGOS PÚBLICOS'),
(14,'EMPLEADOS'),
(15,'CLIENTES Y USUARIOS'),
(16,'PROVEEDORES'),
(17,'ASOCIADOS O MIEMBROS'),
(18,'PROPIETARIOS O ARRENDATARIOS'),
(19,'PACIENTES'),
(20,'ESTUDIANTES'),
(21,'PERSONAS DE CONTACTO'),
(22,'PADRES O TUTORES'),
(23,'REPRESENTANTE LEGAL'),
(24,'SOLICITANTES'),
(25,'BENEFICIARIOS'),
(26,'CARGOS PÚBLICOS');
/*!40000 ALTER TABLE `list_collectivesorcategories` ENABLE KEYS */;
UNLOCK TABLES;
commit;

--
-- Table structure for table `list_filetype`
--

DROP TABLE IF EXISTS `list_filetype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;
CREATE TABLE `list_filetype` (
  `idfiletype` int(11) NOT NULL AUTO_INCREMENT,
  `file_type_name` varchar(20) DEFAULT 'automatizado',
  PRIMARY KEY (`idfiletype`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `list_filetype`
--

LOCK TABLES `list_filetype` WRITE;
/*!40000 ALTER TABLE `list_filetype` DISABLE KEYS */;
set autocommit=0;
INSERT INTO `list_filetype` VALUES
(1,'automatizado'),
(2,'no automatizado'),
(3,'mixto');
/*!40000 ALTER TABLE `list_filetype` ENABLE KEYS */;
UNLOCK TABLES;
commit;

--
-- Table structure for table `list_generictypenotifications`
--

DROP TABLE IF EXISTS `list_generictypenotifications`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;
CREATE TABLE `list_generictypenotifications` (
  `idlist_generictypenotifications` int(11) NOT NULL DEFAULT 1,
  `notificationname` varchar(255) NOT NULL,
  PRIMARY KEY (`idlist_generictypenotifications`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `list_generictypenotifications`
--

LOCK TABLES `list_generictypenotifications` WRITE;
/*!40000 ALTER TABLE `list_generictypenotifications` DISABLE KEYS */;
set autocommit=0;
INSERT INTO `list_generictypenotifications` VALUES
(1,'Comunidad de propietarios'),
(2,'Clientes y/o Proveedores'),
(3,'Libro Recetario'),
(4,'Nóminas - Recursos Humanos'),
(5,'Pacientes'),
(6,'Gestión Escolar'),
(7,'Videovigilancia');
/*!40000 ALTER TABLE `list_generictypenotifications` ENABLE KEYS */;
UNLOCK TABLES;
commit;

--
-- Table structure for table `list_impact_evaluation`
--

DROP TABLE IF EXISTS `list_impact_evaluation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;
CREATE TABLE `list_impact_evaluation` (
  `idlist_impact_evaluation` int(11) NOT NULL DEFAULT 1,
  `impact_description` longtext DEFAULT NULL,
  `impact_evaluation` longtext DEFAULT NULL,
  `identerprise` int(11) DEFAULT NULL,
  `idclient` int(11) DEFAULT NULL,
  PRIMARY KEY (`idlist_impact_evaluation`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `list_seclevel`
--

DROP TABLE IF EXISTS `list_seclevel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;
CREATE TABLE `list_seclevel` (
  `idseclevel` int(11) NOT NULL AUTO_INCREMENT,
  `security_level` varchar(60) NOT NULL,
  PRIMARY KEY (`idseclevel`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `list_seclevel`
--

LOCK TABLES `list_seclevel` WRITE;
/*!40000 ALTER TABLE `list_seclevel` DISABLE KEYS */;
set autocommit=0;
INSERT INTO `list_seclevel` VALUES
(4,'básico'),
(5,'medio'),
(6,'alto');
/*!40000 ALTER TABLE `list_seclevel` ENABLE KEYS */;
UNLOCK TABLES;
commit;

--
-- Table structure for table `list_tcountries`
--

DROP TABLE IF EXISTS `list_tcountries`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;
CREATE TABLE `list_tcountries` (
  `PAI_PK` int(11) NOT NULL AUTO_INCREMENT,
  `PAI_ISONUM` smallint(6) DEFAULT NULL,
  `PAI_ISO2` char(2) DEFAULT NULL,
  `PAI_ISO3` char(3) DEFAULT NULL,
  `PAI_NAME` varchar(80) DEFAULT NULL,
  PRIMARY KEY (`PAI_PK`)
) ENGINE=InnoDB AUTO_INCREMENT=483 DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `list_tcountries`
--

LOCK TABLES `list_tcountries` WRITE;
/*!40000 ALTER TABLE `list_tcountries` DISABLE KEYS */;
set autocommit=0;
INSERT INTO `list_tcountries` VALUES
(1,4,'AF','AFG','Afganistán'),
(2,248,'AX','ALA','Islas Gland'),
(3,8,'AL','ALB','Albania'),
(4,276,'DE','DEU','Alemania'),
(5,20,'AD','AND','Andorra'),
(6,24,'AO','AGO','Angola'),
(7,660,'AI','AIA','Anguilla'),
(8,10,'AQ','ATA','Antártida'),
(9,28,'AG','ATG','Antigua y Barbuda'),
(10,530,'AN','ANT','Antillas Holandesas'),
(11,682,'SA','SAU','Arabia Saudí'),
(12,12,'DZ','DZA','Argelia'),
(13,32,'AR','ARG','Argentina'),
(14,51,'AM','ARM','Armenia'),
(15,533,'AW','ABW','Aruba'),
(16,36,'AU','AUS','Australia'),
(17,40,'AT','AUT','Austria'),
(18,31,'AZ','AZE','Azerbaiyán'),
(19,44,'BS','BHS','Bahamas'),
(20,48,'BH','BHR','Bahréin'),
(21,50,'BD','BGD','Bangladesh'),
(22,52,'BB','BRB','Barbados'),
(23,112,'BY','BLR','Bielorrusia'),
(24,56,'BE','BEL','Bélgica'),
(25,84,'BZ','BLZ','Belice'),
(26,204,'BJ','BEN','Benin'),
(27,60,'BM','BMU','Bermudas'),
(28,64,'BT','BTN','Bhután'),
(29,68,'BO','BOL','Bolivia'),
(30,70,'BA','BIH','Bosnia y Herzegovina'),
(31,72,'BW','BWA','Botsuana'),
(32,74,'BV','BVT','Isla Bouvet'),
(33,76,'BR','BRA','Brasil'),
(34,96,'BN','BRN','Brunéi'),
(35,100,'BG','BGR','Bulgaria'),
(36,854,'BF','BFA','Burkina Faso'),
(37,108,'BI','BDI','Burundi'),
(38,132,'CV','CPV','Cabo Verde'),
(39,136,'KY','CYM','Islas Caimán'),
(40,116,'KH','KHM','Camboya'),
(41,120,'CM','CMR','Camerún'),
(42,124,'CA','CAN','Canadá'),
(43,140,'CF','CAF','República Centroafricana'),
(44,148,'TD','TCD','Chad'),
(45,203,'CZ','CZE','República Checa'),
(46,152,'CL','CHL','Chile'),
(47,156,'CN','CHN','China'),
(48,196,'CY','CYP','Chipre'),
(49,162,'CX','CXR','Isla de Navidad'),
(50,336,'VA','VAT','Ciudad del Vaticano'),
(51,166,'CC','CCK','Islas Cocos'),
(52,170,'CO','COL','Colombia'),
(53,174,'KM','COM','Comoras'),
(54,180,'CD','COD','República Democrática del Congo'),
(55,178,'CG','COG','Congo'),
(56,184,'CK','COK','Islas Cook'),
(57,408,'KP','PRK','Corea del Norte'),
(58,410,'KR','KOR','Corea del Sur'),
(59,384,'CI','CIV','Costa de Marfil'),
(60,188,'CR','CRI','Costa Rica'),
(61,191,'HR','HRV','Croacia'),
(62,192,'CU','CUB','Cuba'),
(63,208,'DK','DNK','Dinamarca'),
(64,212,'DM','DMA','Dominica'),
(65,214,'DO','DOM','República Dominicana'),
(66,218,'EC','ECU','Ecuador'),
(67,818,'EG','EGY','Egipto'),
(68,222,'SV','SLV','El Salvador'),
(69,784,'AE','ARE','Emiratos Árabes Unidos'),
(70,232,'ER','ERI','Eritrea'),
(71,703,'SK','SVK','Eslovaquia'),
(72,705,'SI','SVN','Eslovenia'),
(73,724,'ES','ESP','España'),
(74,581,'UM','UMI','Islas ultramarinas de Estados Unidos'),
(75,840,'US','USA','Estados Unidos'),
(76,233,'EE','EST','Estonia'),
(77,231,'ET','ETH','Etiopía'),
(78,234,'FO','FRO','Islas Feroe'),
(79,608,'PH','PHL','Filipinas'),
(80,246,'FI','FIN','Finlandia'),
(81,242,'FJ','FJI','Fiyi'),
(82,250,'FR','FRA','Francia'),
(83,266,'GA','GAB','Gabón'),
(84,270,'GM','GMB','Gambia'),
(85,268,'GE','GEO','Georgia'),
(86,239,'GS','SGS','Islas Georgias del Sur y Sandwich del Sur'),
(87,288,'GH','GHA','Ghana'),
(88,292,'GI','GIB','Gibraltar'),
(89,308,'GD','GRD','Granada'),
(90,300,'GR','GRC','Grecia'),
(91,304,'GL','GRL','Groenlandia'),
(92,312,'GP','GLP','Guadalupe'),
(93,316,'GU','GUM','Guam'),
(94,320,'GT','GTM','Guatemala'),
(95,254,'GF','GUF','Guayana Francesa'),
(96,324,'GN','GIN','Guinea'),
(97,226,'GQ','GNQ','Guinea Ecuatorial'),
(98,624,'GW','GNB','Guinea-Bissau'),
(99,328,'GY','GUY','Guyana'),
(100,332,'HT','HTI','Haití'),
(101,334,'HM','HMD','Islas Heard y McDonald'),
(102,340,'HN','HND','Honduras'),
(103,344,'HK','HKG','Hong Kong'),
(104,348,'HU','HUN','Hungría'),
(105,356,'IN','IND','India'),
(106,360,'ID','IDN','Indonesia'),
(107,364,'IR','IRN','Irán'),
(108,368,'IQ','IRQ','Iraq'),
(109,372,'IE','IRL','Irlanda'),
(110,352,'IS','ISL','Islandia'),
(111,376,'IL','ISR','Israel'),
(112,380,'IT','ITA','Italia'),
(113,388,'JM','JAM','Jamaica'),
(114,392,'JP','JPN','Japón'),
(115,400,'JO','JOR','Jordania'),
(116,398,'KZ','KAZ','Kazajstán'),
(117,404,'KE','KEN','Kenia'),
(118,417,'KG','KGZ','Kirguistán'),
(119,296,'KI','KIR','Kiribati'),
(120,414,'KW','KWT','Kuwait'),
(121,418,'LA','LAO','Laos'),
(122,426,'LS','LSO','Lesotho'),
(123,428,'LV','LVA','Letonia'),
(124,422,'LB','LBN','Líbano'),
(125,430,'LR','LBR','Liberia'),
(126,434,'LY','LBY','Libia'),
(127,438,'LI','LIE','Liechtenstein'),
(128,440,'LT','LTU','Lituania'),
(129,442,'LU','LUX','Luxemburgo'),
(130,446,'MO','MAC','Macao'),
(131,807,'MK','MKD','ARY Macedonia'),
(132,450,'MG','MDG','Madagascar'),
(133,458,'MY','MYS','Malasia'),
(134,454,'MW','MWI','Malawi'),
(135,462,'MV','MDV','Maldivas'),
(136,466,'ML','MLI','Malí'),
(137,470,'MT','MLT','Malta'),
(138,238,'FK','FLK','Islas Malvinas'),
(139,580,'MP','MNP','Islas Marianas del Norte'),
(140,504,'MA','MAR','Marruecos'),
(141,584,'MH','MHL','Islas Marshall'),
(142,474,'MQ','MTQ','Martinica'),
(143,480,'MU','MUS','Mauricio'),
(144,478,'MR','MRT','Mauritania'),
(145,175,'YT','MYT','Mayotte'),
(146,484,'MX','MEX','México'),
(147,583,'FM','FSM','Micronesia'),
(148,498,'MD','MDA','Moldavia'),
(149,492,'MC','MCO','Mónaco'),
(150,496,'MN','MNG','Mongolia'),
(151,500,'MS','MSR','Montserrat'),
(152,508,'MZ','MOZ','Mozambique'),
(153,104,'MM','MMR','Myanmar'),
(154,516,'NA','NAM','Namibia'),
(155,520,'NR','NRU','Nauru'),
(156,524,'NP','NPL','Nepal'),
(157,558,'NI','NIC','Nicaragua'),
(158,562,'NE','NER','Níger'),
(159,566,'NG','NGA','Nigeria'),
(160,570,'NU','NIU','Niue'),
(161,574,'NF','NFK','Isla Norfolk'),
(162,578,'NO','NOR','Noruega'),
(163,540,'NC','NCL','Nueva Caledonia'),
(164,554,'NZ','NZL','Nueva Zelanda'),
(165,512,'OM','OMN','Omán'),
(166,528,'NL','NLD','Países Bajos'),
(167,586,'PK','PAK','Pakistán'),
(168,585,'PW','PLW','Palau'),
(169,275,'PS','PSE','Palestina'),
(170,591,'PA','PAN','Panamá'),
(171,598,'PG','PNG','Papúa Nueva Guinea'),
(172,600,'PY','PRY','Paraguay'),
(173,604,'PE','PER','Perú'),
(174,612,'PN','PCN','Islas Pitcairn'),
(175,258,'PF','PYF','Polinesia Francesa'),
(176,616,'PL','POL','Polonia'),
(177,620,'PT','PRT','Portugal'),
(178,630,'PR','PRI','Puerto Rico'),
(179,634,'QA','QAT','Qatar'),
(180,826,'GB','GBR','Reino Unido'),
(181,638,'RE','REU','Reunión'),
(182,646,'RW','RWA','Ruanda'),
(183,642,'RO','ROU','Rumania'),
(184,643,'RU','RUS','Rusia'),
(185,732,'EH','ESH','Sahara Occidental'),
(186,90,'SB','SLB','Islas Salomón'),
(187,882,'WS','WSM','Samoa'),
(188,16,'AS','ASM','Samoa Americana'),
(189,659,'KN','KNA','San Cristóbal y Nevis'),
(190,674,'SM','SMR','San Marino'),
(191,666,'PM','SPM','San Pedro y Miquelón'),
(192,670,'VC','VCT','San Vicente y las Granadinas'),
(193,654,'SH','SHN','Santa Helena'),
(194,662,'LC','LCA','Santa Lucía'),
(195,678,'ST','STP','Santo Tomé y Príncipe'),
(196,686,'SN','SEN','Senegal'),
(197,891,'CS','SCG','Serbia y Montenegro'),
(198,690,'SC','SYC','Seychelles'),
(199,694,'SL','SLE','Sierra Leona'),
(200,702,'SG','SGP','Singapur'),
(201,760,'SY','SYR','Siria'),
(202,706,'SO','SOM','Somalia'),
(203,144,'LK','LKA','Sri Lanka'),
(204,748,'SZ','SWZ','Suazilandia'),
(205,710,'ZA','ZAF','Sudáfrica'),
(206,736,'SD','SDN','Sudán'),
(207,752,'SE','SWE','Suecia'),
(208,756,'CH','CHE','Suiza'),
(209,740,'SR','SUR','Surinam'),
(210,744,'SJ','SJM','Svalbard y Jan Mayen'),
(211,764,'TH','THA','Tailandia'),
(212,158,'TW','TWN','Taiwán'),
(213,834,'TZ','TZA','Tanzania'),
(214,762,'TJ','TJK','Tayikistán'),
(215,86,'IO','IOT','Territorio Británico del Océano Índico'),
(216,260,'TF','ATF','Territorios Australes Franceses'),
(217,626,'TL','TLS','Timor Oriental'),
(218,768,'TG','TGO','Togo'),
(219,772,'TK','TKL','Tokelau'),
(220,776,'TO','TON','Tonga'),
(221,780,'TT','TTO','Trinidad y Tobago'),
(222,788,'TN','TUN','Túnez'),
(223,796,'TC','TCA','Islas Turcas y Caicos'),
(224,795,'TM','TKM','Turkmenistán'),
(225,792,'TR','TUR','Turquía'),
(226,798,'TV','TUV','Tuvalu'),
(227,804,'UA','UKR','Ucrania'),
(228,800,'UG','UGA','Uganda'),
(229,858,'UY','URY','Uruguay'),
(230,860,'UZ','UZB','Uzbekistán'),
(231,548,'VU','VUT','Vanuatu'),
(232,862,'VE','VEN','Venezuela'),
(233,704,'VN','VNM','Vietnam'),
(234,92,'VG','VGB','Islas Vírgenes Británicas'),
(235,850,'VI','VIR','Islas Vírgenes de los Estados Unidos'),
(236,876,'WF','WLF','Wallis y Futuna'),
(237,887,'YE','YEM','Yemen'),
(238,262,'DJ','DJI','Yibuti'),
(239,894,'ZM','ZMB','Zambia'),
(240,716,'ZW','ZWE','Zimbabue'),
(241,0,'VP','VP','Internacional'),
(242,4,'AF','AFG','Afganistán'),
(243,248,'AX','ALA','Islas Gland'),
(244,8,'AL','ALB','Albania'),
(245,276,'DE','DEU','Alemania'),
(246,20,'AD','AND','Andorra'),
(247,24,'AO','AGO','Angola'),
(248,660,'AI','AIA','Anguilla'),
(249,10,'AQ','ATA','Antártida'),
(250,28,'AG','ATG','Antigua y Barbuda'),
(251,530,'AN','ANT','Antillas Holandesas'),
(252,682,'SA','SAU','Arabia Saudí'),
(253,12,'DZ','DZA','Argelia'),
(254,32,'AR','ARG','Argentina'),
(255,51,'AM','ARM','Armenia'),
(256,533,'AW','ABW','Aruba'),
(257,36,'AU','AUS','Australia'),
(258,40,'AT','AUT','Austria'),
(259,31,'AZ','AZE','Azerbaiyán'),
(260,44,'BS','BHS','Bahamas'),
(261,48,'BH','BHR','Bahréin'),
(262,50,'BD','BGD','Bangladesh'),
(263,52,'BB','BRB','Barbados'),
(264,112,'BY','BLR','Bielorrusia'),
(265,56,'BE','BEL','Bélgica'),
(266,84,'BZ','BLZ','Belice'),
(267,204,'BJ','BEN','Benin'),
(268,60,'BM','BMU','Bermudas'),
(269,64,'BT','BTN','Bhután'),
(270,68,'BO','BOL','Bolivia'),
(271,70,'BA','BIH','Bosnia y Herzegovina'),
(272,72,'BW','BWA','Botsuana'),
(273,74,'BV','BVT','Isla Bouvet'),
(274,76,'BR','BRA','Brasil'),
(275,96,'BN','BRN','Brunéi'),
(276,100,'BG','BGR','Bulgaria'),
(277,854,'BF','BFA','Burkina Faso'),
(278,108,'BI','BDI','Burundi'),
(279,132,'CV','CPV','Cabo Verde'),
(280,136,'KY','CYM','Islas Caimán'),
(281,116,'KH','KHM','Camboya'),
(282,120,'CM','CMR','Camerún'),
(283,124,'CA','CAN','Canadá'),
(284,140,'CF','CAF','República Centroafricana'),
(285,148,'TD','TCD','Chad'),
(286,203,'CZ','CZE','República Checa'),
(287,152,'CL','CHL','Chile'),
(288,156,'CN','CHN','China'),
(289,196,'CY','CYP','Chipre'),
(290,162,'CX','CXR','Isla de Navidad'),
(291,336,'VA','VAT','Ciudad del Vaticano'),
(292,166,'CC','CCK','Islas Cocos'),
(293,170,'CO','COL','Colombia'),
(294,174,'KM','COM','Comoras'),
(295,180,'CD','COD','República Democrática del Congo'),
(296,178,'CG','COG','Congo'),
(297,184,'CK','COK','Islas Cook'),
(298,408,'KP','PRK','Corea del Norte'),
(299,410,'KR','KOR','Corea del Sur'),
(300,384,'CI','CIV','Costa de Marfil'),
(301,188,'CR','CRI','Costa Rica'),
(302,191,'HR','HRV','Croacia'),
(303,192,'CU','CUB','Cuba'),
(304,208,'DK','DNK','Dinamarca'),
(305,212,'DM','DMA','Dominica'),
(306,214,'DO','DOM','República Dominicana'),
(307,218,'EC','ECU','Ecuador'),
(308,818,'EG','EGY','Egipto'),
(309,222,'SV','SLV','El Salvador'),
(310,784,'AE','ARE','Emiratos Árabes Unidos'),
(311,232,'ER','ERI','Eritrea'),
(312,703,'SK','SVK','Eslovaquia'),
(313,705,'SI','SVN','Eslovenia'),
(314,724,'ES','ESP','España'),
(315,581,'UM','UMI','Islas ultramarinas de Estados Unidos'),
(316,840,'US','USA','Estados Unidos'),
(317,233,'EE','EST','Estonia'),
(318,231,'ET','ETH','Etiopía'),
(319,234,'FO','FRO','Islas Feroe'),
(320,608,'PH','PHL','Filipinas'),
(321,246,'FI','FIN','Finlandia'),
(322,242,'FJ','FJI','Fiyi'),
(323,250,'FR','FRA','Francia'),
(324,266,'GA','GAB','Gabón'),
(325,270,'GM','GMB','Gambia'),
(326,268,'GE','GEO','Georgia'),
(327,239,'GS','SGS','Islas Georgias del Sur y Sandwich del Sur'),
(328,288,'GH','GHA','Ghana'),
(329,292,'GI','GIB','Gibraltar'),
(330,308,'GD','GRD','Granada'),
(331,300,'GR','GRC','Grecia'),
(332,304,'GL','GRL','Groenlandia'),
(333,312,'GP','GLP','Guadalupe'),
(334,316,'GU','GUM','Guam'),
(335,320,'GT','GTM','Guatemala'),
(336,254,'GF','GUF','Guayana Francesa'),
(337,324,'GN','GIN','Guinea'),
(338,226,'GQ','GNQ','Guinea Ecuatorial'),
(339,624,'GW','GNB','Guinea-Bissau'),
(340,328,'GY','GUY','Guyana'),
(341,332,'HT','HTI','Haití'),
(342,334,'HM','HMD','Islas Heard y McDonald'),
(343,340,'HN','HND','Honduras'),
(344,344,'HK','HKG','Hong Kong'),
(345,348,'HU','HUN','Hungría'),
(346,356,'IN','IND','India'),
(347,360,'ID','IDN','Indonesia'),
(348,364,'IR','IRN','Irán'),
(349,368,'IQ','IRQ','Iraq'),
(350,372,'IE','IRL','Irlanda'),
(351,352,'IS','ISL','Islandia'),
(352,376,'IL','ISR','Israel'),
(353,380,'IT','ITA','Italia'),
(354,388,'JM','JAM','Jamaica'),
(355,392,'JP','JPN','Japón'),
(356,400,'JO','JOR','Jordania'),
(357,398,'KZ','KAZ','Kazajstán'),
(358,404,'KE','KEN','Kenia'),
(359,417,'KG','KGZ','Kirguistán'),
(360,296,'KI','KIR','Kiribati'),
(361,414,'KW','KWT','Kuwait'),
(362,418,'LA','LAO','Laos'),
(363,426,'LS','LSO','Lesotho'),
(364,428,'LV','LVA','Letonia'),
(365,422,'LB','LBN','Líbano'),
(366,430,'LR','LBR','Liberia'),
(367,434,'LY','LBY','Libia'),
(368,438,'LI','LIE','Liechtenstein'),
(369,440,'LT','LTU','Lituania'),
(370,442,'LU','LUX','Luxemburgo'),
(371,446,'MO','MAC','Macao'),
(372,807,'MK','MKD','ARY Macedonia'),
(373,450,'MG','MDG','Madagascar'),
(374,458,'MY','MYS','Malasia'),
(375,454,'MW','MWI','Malawi'),
(376,462,'MV','MDV','Maldivas'),
(377,466,'ML','MLI','Malí'),
(378,470,'MT','MLT','Malta'),
(379,238,'FK','FLK','Islas Malvinas'),
(380,580,'MP','MNP','Islas Marianas del Norte'),
(381,504,'MA','MAR','Marruecos'),
(382,584,'MH','MHL','Islas Marshall'),
(383,474,'MQ','MTQ','Martinica'),
(384,480,'MU','MUS','Mauricio'),
(385,478,'MR','MRT','Mauritania'),
(386,175,'YT','MYT','Mayotte'),
(387,484,'MX','MEX','México'),
(388,583,'FM','FSM','Micronesia'),
(389,498,'MD','MDA','Moldavia'),
(390,492,'MC','MCO','Mónaco'),
(391,496,'MN','MNG','Mongolia'),
(392,500,'MS','MSR','Montserrat'),
(393,508,'MZ','MOZ','Mozambique'),
(394,104,'MM','MMR','Myanmar'),
(395,516,'NA','NAM','Namibia'),
(396,520,'NR','NRU','Nauru'),
(397,524,'NP','NPL','Nepal'),
(398,558,'NI','NIC','Nicaragua'),
(399,562,'NE','NER','Níger'),
(400,566,'NG','NGA','Nigeria'),
(401,570,'NU','NIU','Niue'),
(402,574,'NF','NFK','Isla Norfolk'),
(403,578,'NO','NOR','Noruega'),
(404,540,'NC','NCL','Nueva Caledonia'),
(405,554,'NZ','NZL','Nueva Zelanda'),
(406,512,'OM','OMN','Omán'),
(407,528,'NL','NLD','Países Bajos'),
(408,586,'PK','PAK','Pakistán'),
(409,585,'PW','PLW','Palau'),
(410,275,'PS','PSE','Palestina'),
(411,591,'PA','PAN','Panamá'),
(412,598,'PG','PNG','Papúa Nueva Guinea'),
(413,600,'PY','PRY','Paraguay'),
(414,604,'PE','PER','Perú'),
(415,612,'PN','PCN','Islas Pitcairn'),
(416,258,'PF','PYF','Polinesia Francesa'),
(417,616,'PL','POL','Polonia'),
(418,620,'PT','PRT','Portugal'),
(419,630,'PR','PRI','Puerto Rico'),
(420,634,'QA','QAT','Qatar'),
(421,826,'GB','GBR','Reino Unido'),
(422,638,'RE','REU','Reunión'),
(423,646,'RW','RWA','Ruanda'),
(424,642,'RO','ROU','Rumania'),
(425,643,'RU','RUS','Rusia'),
(426,732,'EH','ESH','Sahara Occidental'),
(427,90,'SB','SLB','Islas Salomón'),
(428,882,'WS','WSM','Samoa'),
(429,16,'AS','ASM','Samoa Americana'),
(430,659,'KN','KNA','San Cristóbal y Nevis'),
(431,674,'SM','SMR','San Marino'),
(432,666,'PM','SPM','San Pedro y Miquelón'),
(433,670,'VC','VCT','San Vicente y las Granadinas'),
(434,654,'SH','SHN','Santa Helena'),
(435,662,'LC','LCA','Santa Lucía'),
(436,678,'ST','STP','Santo Tomé y Príncipe'),
(437,686,'SN','SEN','Senegal'),
(438,891,'CS','SCG','Serbia y Montenegro'),
(439,690,'SC','SYC','Seychelles'),
(440,694,'SL','SLE','Sierra Leona'),
(441,702,'SG','SGP','Singapur'),
(442,760,'SY','SYR','Siria'),
(443,706,'SO','SOM','Somalia'),
(444,144,'LK','LKA','Sri Lanka'),
(445,748,'SZ','SWZ','Suazilandia'),
(446,710,'ZA','ZAF','Sudáfrica'),
(447,736,'SD','SDN','Sudán'),
(448,752,'SE','SWE','Suecia'),
(449,756,'CH','CHE','Suiza'),
(450,740,'SR','SUR','Surinam'),
(451,744,'SJ','SJM','Svalbard y Jan Mayen'),
(452,764,'TH','THA','Tailandia'),
(453,158,'TW','TWN','Taiwán'),
(454,834,'TZ','TZA','Tanzania'),
(455,762,'TJ','TJK','Tayikistán'),
(456,86,'IO','IOT','Territorio Británico del Océano Índico'),
(457,260,'TF','ATF','Territorios Australes Franceses'),
(458,626,'TL','TLS','Timor Oriental'),
(459,768,'TG','TGO','Togo'),
(460,772,'TK','TKL','Tokelau'),
(461,776,'TO','TON','Tonga'),
(462,780,'TT','TTO','Trinidad y Tobago'),
(463,788,'TN','TUN','Túnez'),
(464,796,'TC','TCA','Islas Turcas y Caicos'),
(465,795,'TM','TKM','Turkmenistán'),
(466,792,'TR','TUR','Turquía'),
(467,798,'TV','TUV','Tuvalu'),
(468,804,'UA','UKR','Ucrania'),
(469,800,'UG','UGA','Uganda'),
(470,858,'UY','URY','Uruguay'),
(471,860,'UZ','UZB','Uzbekistán'),
(472,548,'VU','VUT','Vanuatu'),
(473,862,'VE','VEN','Venezuela'),
(474,704,'VN','VNM','Vietnam'),
(475,92,'VG','VGB','Islas Vírgenes Británicas'),
(476,850,'VI','VIR','Islas Vírgenes de los Estados Unidos'),
(477,876,'WF','WLF','Wallis y Futuna'),
(478,887,'YE','YEM','Yemen'),
(479,262,'DJ','DJI','Yibuti'),
(480,894,'ZM','ZMB','Zambia'),
(481,716,'ZW','ZWE','Zimbabue'),
(482,0,'VP','VP','Internacional');
/*!40000 ALTER TABLE `list_tcountries` ENABLE KEYS */;
UNLOCK TABLES;
commit;

--
-- Table structure for table `list_tprovinces`
--

DROP TABLE IF EXISTS `list_tprovinces`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;
CREATE TABLE `list_tprovinces` (
  `idprovinces` int(11) NOT NULL,
  `provincia` varchar(255) NOT NULL,
  PRIMARY KEY (`idprovinces`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `list_tprovinces`
--

LOCK TABLES `list_tprovinces` WRITE;
/*!40000 ALTER TABLE `list_tprovinces` DISABLE KEYS */;
set autocommit=0;
INSERT INTO `list_tprovinces` VALUES
(1,'Alava'),
(2,'Albacete'),
(3,'Alicante'),
(4,'Almería'),
(5,'Ávila'),
(6,'Badajoz'),
(7,'Illes Balears'),
(8,'Barcelona'),
(9,'Burgos'),
(10,'Cáceres'),
(11,'Cádiz'),
(12,'Castellón'),
(13,'Ciudad Real'),
(14,'Córdoba'),
(15,'La Coruña'),
(16,'Cuenca'),
(17,'Gerona'),
(18,'Granada'),
(19,'Guadalajara'),
(20,'Guipúzcoa'),
(21,'Huelva'),
(22,'Huesca'),
(23,'Jaén'),
(24,'León'),
(25,'Lérida'),
(26,'La Rioja'),
(27,'Lugo'),
(28,'Madrid'),
(29,'Málaga'),
(30,'Murcia'),
(31,'Navarra'),
(32,'Navarra'),
(33,'Asturias'),
(34,'Palencia'),
(35,'Las Palmas'),
(36,'Pontevedra'),
(37,'Salamanca'),
(38,'Santa Cruz de Tenerife'),
(39,'Cantabria'),
(40,'Segovia'),
(41,'Sevilla'),
(42,'Soria'),
(43,'Tarragona'),
(44,'Teruel'),
(45,'Toledo'),
(46,'Valencia'),
(47,'Valladolid'),
(48,'Vizcaya'),
(49,'Zamora'),
(50,'Zaragoza'),
(51,'Ceuta'),
(52,'Melilla');
/*!40000 ALTER TABLE `list_tprovinces` ENABLE KEYS */;
UNLOCK TABLES;
commit;

DROP TABLE IF EXISTS `list_personaldatadb`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;

CREATE TABLE `list_personaldatadb` (
  `idpersonaldatadb` int(11) NOT NULL AUTO_INCREMENT,
  `idclient` int(11) DEFAULT NULL,
  `identerprise` int(11) DEFAULT 1,
  `dbname` varchar(100) DEFAULT NULL,
  `dbdescritiob` longtext DEFAULT NULL,
  PRIMARY KEY (`idpersonaldatadb`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
--
-- Table structure for table `list_treatypes`
--

DROP TABLE IF EXISTS `list_treatypes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;
CREATE TABLE `list_treatypes` (
  `idlist_treatypes` int(11) NOT NULL AUTO_INCREMENT,
  `n_treatypes` varchar(20) DEFAULT 'automatizado',
  PRIMARY KEY (`idlist_treatypes`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `list_treatypes`
--

LOCK TABLES `list_treatypes` WRITE;
/*!40000 ALTER TABLE `list_treatypes` DISABLE KEYS */;
set autocommit=0;
INSERT INTO `list_treatypes` VALUES
(1,'automatizado'),
(2,'no automatizado'),
(3,'mixto');
/*!40000 ALTER TABLE `list_treatypes` ENABLE KEYS */;
UNLOCK TABLES;
commit;

--
-- Table structure for table `list_tsourcemedia`
--

DROP TABLE IF EXISTS `list_tsourcemedia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;
CREATE TABLE `list_tsourcemedia` (
  `idtsourcemedia` int(11) NOT NULL AUTO_INCREMENT,
  `sourcemedia_name` varchar(20) NOT NULL DEFAULT 'disco',
  PRIMARY KEY (`idtsourcemedia`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `list_tsourcemedia`
--

LOCK TABLES `list_tsourcemedia` WRITE;
/*!40000 ALTER TABLE `list_tsourcemedia` DISABLE KEYS */;
set autocommit=0;
INSERT INTO `list_tsourcemedia` VALUES
(1,'CD'),
(2,'DVD'),
(3,'HD Externo USB'),
(4,'PenDrive'),
(5,'Cinta'),
(6,'BluRay'),
(7,'HD Externo Firewire'),
(8,'HD Externo eSATA'),
(9,'HD Externo Red'),
(10,'Disquete'),
(11,'Documento papel'),
(12,'HD Interno'),
(13,'SSD Interno'),
(14,'CD'),
(15,'DVD'),
(16,'HD EXTERNO'),
(17,'PENDRIVE'),
(18,'CINTA'),
(19,'BLURAY'),
(20,'DISQUETE'),
(21,'PAPEL'),
(22,'SSD EXTERNO'),
(23,'SSD INTERNO'),
(24,'HDD INTERNO'),
(25,'UNIDAD ZIP');
/*!40000 ALTER TABLE `list_tsourcemedia` ENABLE KEYS */;
UNLOCK TABLES;
commit;

--
-- Current Database: `ccpd_registers`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `ccpd_registers` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;

USE `ccpd_registers`;

--
-- Table structure for table `backupandrecoveryprocedure_register`
--

DROP TABLE IF EXISTS `backupandrecoveryprocedure_register`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;
CREATE TABLE `backupandrecoveryprocedure_register` (
  `idbackupandrecoveryprocedureregister` int(11) NOT NULL DEFAULT 1,
  `idclient` int(11) NOT NULL,
  `identerprise` int(11) NOT NULL,
  `idmediadata` int(11) NOT NULL,
  `copyorrecovery` int(11) NOT NULL,
  `backupmanager` int(11) NOT NULL,
  `mediatobackupres` varchar(255) DEFAULT NULL,
  `periodicitycopy` varchar(45) DEFAULT NULL,
  `methodologycopy` varchar(45) DEFAULT NULL,
  `datamediaused` varchar(45) DEFAULT NULL,
  `storagetime` varchar(45) DEFAULT NULL,
  `storagelocation` varchar(45) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `periodicitytransfer` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idbackupandrecoveryprocedureregister`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `incidenceregister`
--

DROP TABLE IF EXISTS `incidenceregister`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;
CREATE TABLE `incidenceregister` (
  `idincidenceregister` int(11) NOT NULL DEFAULT 1,
  `idclient` int(11) NOT NULL,
  `identerprise` int(11) NOT NULL,
  `incidencetype` varchar(255) NOT NULL,
  `incidencereporter` varchar(255) NOT NULL,
  `incidencereportedperson` varchar(255) NOT NULL,
  `incidenceefeccts` longtext NOT NULL,
  `actionstaken` longtext NOT NULL,
  `recoveryprocedure` longtext NOT NULL,
  `datarestored` varchar(255) NOT NULL,
  `datarecorded` varchar(255) NOT NULL,
  `notes` longtext NOT NULL,
  `date` datetime NOT NULL,
  `seclevel` int(11) NOT NULL,
  PRIMARY KEY (`idincidenceregister`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `inoutexitrec_register`
--

DROP TABLE IF EXISTS `inoutexitrec_register`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;
CREATE TABLE `inoutexitrec_register` (
  `idinoutexitrec_register` int(11) NOT NULL DEFAULT 1,
  `idclient` int(11) NOT NULL,
  `identerprise` int(11) NOT NULL,
  `idmediadata` int(11) NOT NULL,
  `copyorrecovery` int(11) NOT NULL,
  `backupmanager` int(11) NOT NULL,
  `mediatobackupres` varchar(255) DEFAULT NULL,
  `periodicitycopy` varchar(45) DEFAULT NULL,
  `methodologycopy` varchar(45) DEFAULT NULL,
  `datamediaused` varchar(45) DEFAULT NULL,
  `storagetime` varchar(45) DEFAULT NULL,
  `storagelocation` varchar(45) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `periodicitytransfer` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idinoutexitrec_register`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inoutexitrec_register`
--

LOCK TABLES `inoutexitrec_register` WRITE;
/*!40000 ALTER TABLE `inoutexitrec_register` DISABLE KEYS */;
set autocommit=0;
/*!40000 ALTER TABLE `inoutexitrec_register` ENABLE KEYS */;
UNLOCK TABLES;
commit;

--
-- Table structure for table `sanctions_register`
--

DROP TABLE IF EXISTS `sanctions_register`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;
CREATE TABLE `sanctions_register` (
  `idsanctions_register` int(11) NOT NULL DEFAULT 1,
  `idclient` int(11) NOT NULL,
  `identerprise` int(11) NOT NULL,
  `punishableact` longtext NOT NULL,
  `sanction` varchar(255) DEFAULT NULL,
  `sanctionedsubject` varchar(255) DEFAULT NULL,
  `date` datetime DEFAULT NULL,
  PRIMARY KEY (`idsanctions_register`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `securitycontrols_register`
--

DROP TABLE IF EXISTS `securitycontrols_register`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;
CREATE TABLE `securitycontrols_register` (
  `idsecuritycontrols_register` int(11) NOT NULL DEFAULT 1,
  `controlmanager` int(11) DEFAULT NULL,
  `securitycontrol_procedure` varchar(255) DEFAULT NULL,
  `securitycontrolresult` varchar(255) DEFAULT NULL,
  `securitycontrolactiontocomplete` varchar(45) DEFAULT NULL,
  `idclient` int(11) NOT NULL,
  `identerprise` int(11) NOT NULL,
  PRIMARY KEY (`idsecuritycontrols_register`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Current Database: `ccpd_security_measures`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `ccpd_security_measures` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;

USE `ccpd_security_measures`;

--
-- Table structure for table `acesscontrollist`
--

DROP TABLE IF EXISTS `acesscontrollist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;
CREATE TABLE `acesscontrollist` (
  `idacesscontrollist` int(11) NOT NULL DEFAULT 1,
  `idclient` int(11) NOT NULL,
  `identerprise` int(11) NOT NULL,
  `idautorized` int(11) NOT NULL,
  `autorizedresources` longtext NOT NULL,
  PRIMARY KEY (`idacesscontrollist`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `alternate_security_measures`
--

DROP TABLE IF EXISTS `alternate_security_measures`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;
CREATE TABLE `alternate_security_measures` (
  `idalternate_security_measures` int(11) NOT NULL,
  `alternate_security_measures_description` varchar(45) DEFAULT NULL,
  `id_ccpd_client` int(11) DEFAULT NULL,
  `id_ccpd_enterprise` int(11) DEFAULT NULL,
  PRIMARY KEY (`idalternate_security_measures`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;


--
-- Table structure for table `authorizations_delegated`
--

DROP TABLE IF EXISTS `authorizations_delegated`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;
CREATE TABLE `authorizations_delegated` (
  `idauthorizations_delegated` int(11) NOT NULL AUTO_INCREMENT,
  `authorizations_delegated_description` varchar(45) DEFAULT NULL,
  `idclient` int(11) NOT NULL,
  `identerprise` int(11) NOT NULL,
  PRIMARY KEY (`idauthorizations_delegated`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `autorizations`
--

DROP TABLE IF EXISTS `autorizations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;
CREATE TABLE `autorizations` (
  `idautorizations` int(11) NOT NULL DEFAULT 1,
  `idcclient` int(11) DEFAULT NULL,
  `identerprise` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `position` varchar(85) DEFAULT NULL,
  `resources` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idautorizations`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

-- ccpd_security_measures.behaviourcodes definition
DROP TABLE IF EXISTS `behaviourcodes`;
CREATE TABLE `behaviourcodes` (
  `idbehaviourcode` int(11) NOT NULL AUTO_INCREMENT,
  `desscr_behaviourcodes` longtext DEFAULT NULL,
  `idclient` int(11) NOT NULL,
  `identerprise` int(11) NOT NULL,
  PRIMARY KEY (`idbehaviourcode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Table structure for table `datatreatment_manager`
--

DROP TABLE IF EXISTS `datatreatment_manager`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;
CREATE TABLE `datatreatment_manager` (
  `iddatatreartment_manager` int(11) NOT NULL AUTO_INCREMENT,
  `treatment_description` longtext DEFAULT NULL,
  `id_ccpd_enterprise` int(11) DEFAULT NULL,
  `id_ccpd_client` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`iddatatreartment_manager`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `external_data_treatment`
--

DROP TABLE IF EXISTS `external_data_treatment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;
CREATE TABLE `external_data_treatment` (
  `idexternal_data_treatment` int(11) NOT NULL AUTO_INCREMENT,
  `external_data_treatmentc_description` varchar(45) DEFAULT NULL,
  `id_ccpd_client` int(11) DEFAULT NULL,
  `id_ccp_enterprise` int(11) DEFAULT NULL,
  PRIMARY KEY (`idexternal_data_treatment`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;


--
-- Table structure for table `mediaanddocuments`
--

DROP TABLE IF EXISTS `mediaanddocuments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;
CREATE TABLE `mediaanddocuments` (
  `idmediaanddocuments` int(11) NOT NULL DEFAULT 1,
  `idmedia` int(11) NOT NULL,
  `idclient` int(11) NOT NULL,
  `identerprise` int(11) NOT NULL,
  `dateandtime` date NOT NULL,
  `mediarecipient` varchar(255) NOT NULL,
  `medianumberorcode` varchar(45) NOT NULL,
  `informationtype` varchar(45) NOT NULL,
  `shippingmethod` varchar(45) NOT NULL,
  `idautorized` int(11) NOT NULL,
  `deliveryorreception` int(11) NOT NULL,
  PRIMARY KEY (`idmediaanddocuments`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `nominations`
--

DROP TABLE IF EXISTS `nominations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;
CREATE TABLE `nominations` (
  `idnominations` int(11) NOT NULL DEFAULT 1,
  `idclient` int(11) DEFAULT NULL,
  `identerprise` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `position` varchar(85) DEFAULT NULL,
  `permissions` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idnominations`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `security_procedures`
--

DROP TABLE IF EXISTS `security_procedures`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;
CREATE TABLE `security_procedures` (
  `idsecurity_procedures` int(11) NOT NULL AUTO_INCREMENT,
  `security_procedures_description` longtext DEFAULT NULL,
  `id_ccpd_client` int(11) DEFAULT NULL,
  `id_ccpd_enterprise` int(11) DEFAULT NULL,
  PRIMARY KEY (`idsecurity_procedures`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `specificcontrolaccessprocedures`
--

DROP TABLE IF EXISTS `specificcontrolaccessprocedures`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;
CREATE TABLE `specificcontrolaccessprocedures` (
  `idspecificcontrolaccessprocedures` int(11) NOT NULL AUTO_INCREMENT,
  `idclient` int(11) NOT NULL,
  `identerprise` int(11) NOT NULL,
  `specificaccessprocedure` varchar(255) NOT NULL,
  `specificcontrolprocedure` varchar(255) NOT NULL,
  PRIMARY KEY (`idspecificcontrolaccessprocedures`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `workers_functionsandobligations`
--

DROP TABLE IF EXISTS `workers_functionsandobligations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;
CREATE TABLE `workers_functionsandobligations` (
  `idworkers_functionsandobligations` int(11) NOT NULL,
  `id_ccpd_client` int(11) DEFAULT NULL,
  `id_ccpd_enterprise` int(11) DEFAULT NULL,
  `id_workers` int(11) DEFAULT NULL,
  `workers_functionsandobligations_description` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idworkers_functionsandobligations`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Current Database: `ccpd_treat_activity_creator`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `ccpd_treat_activity_creator` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;

USE `ccpd_treat_activity_creator`;

--
-- Table structure for table `treatactivity`
--

DROP TABLE IF EXISTS `treatactivity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;
CREATE TABLE `treatactivity` (
  `idtreatactivity` int(11) NOT NULL DEFAULT 1,
  `idclient` int(11) NOT NULL,
  `identerprise` int(11) NOT NULL,
  `idcode` varchar(255) DEFAULT NULL,
  `additionalinfo` longtext DEFAULT NULL,
  `managerdata` longtext NOT NULL,
  `comanagerdata` longtext DEFAULT NULL,
  `repmanagerdata` longtext DEFAULT NULL,
  `dataprotectiondelegatedata` longtext NOT NULL,
  `treatprurposes` longtext NOT NULL,
  `stakeholdercategories` longtext NOT NULL,
  `personaldatadescriptioncategories` longtext NOT NULL,
  `typeoftreatment` varchar(255) NOT NULL,
  `recipentscategories` longtext NOT NULL,
  `countriesenterprisestarget` varchar(255) NOT NULL,
  `internationalpersonaldatatransfers` longtext DEFAULT NULL,
  `deadlinesdeletingdatacategories` longtext NOT NULL,
  `riskandfreedoomanalisysrisk` longtext DEFAULT NULL,
  `treatmentsystematicdescription` longtext DEFAULT NULL,
  `processinginformationsystems` varchar(255) DEFAULT NULL,
  `safeguardsprovidedinternationaldata` longtext DEFAULT NULL,
  `processingoperationsusersdata` longtext DEFAULT NULL,
  `responsibleclaims` varchar(255) NOT NULL,
  `legalrigths` longtext DEFAULT NULL,
  `legalbasis` longtext NOT NULL,
  PRIMARY KEY (`idtreatactivity`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Current Database: `ccpd_treat_risks`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `ccpd_treat_risks` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;

USE `ccpd_treat_risks`;

--
-- Table structure for table `evaluationrisklist`
--

DROP TABLE IF EXISTS `evaluationrisklist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;
CREATE TABLE `evaluationrisklist` (
  `idevaluationrisklist` int(11) NOT NULL AUTO_INCREMENT,
  `idrisk` int(11) DEFAULT NULL,
  `evaluation` longtext DEFAULT NULL,
  `identerprise` int(11) NOT NULL,
  `idclient` int(11) NOT NULL,
  PRIMARY KEY (`idevaluationrisklist`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `riskmanagementlist`
--

DROP TABLE IF EXISTS `riskmanagementlist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;
CREATE TABLE `riskmanagementlist` (
  `idriskmanagementlist` int(11) NOT NULL DEFAULT 1,
  `risk` varchar(255) NOT NULL,
  `notes` longtext DEFAULT NULL,
  `identerprise` int(11) NOT NULL,
  `idclient` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idriskmanagementlist`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;


/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*M!100616 SET NOTE_VERBOSITY=@OLD_NOTE_VERBOSITY */;

-- Dump completed on 2025-11-20 11:02:08
