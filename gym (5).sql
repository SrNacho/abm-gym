-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 29-11-2020 a las 02:44:00
-- Versión del servidor: 10.4.14-MariaDB
-- Versión de PHP: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `gym`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `anotados`
--

CREATE TABLE `anotados` (
  `dni` varchar(8) CHARACTER SET utf8mb4 NOT NULL,
  `nombre` varchar(16) CHARACTER SET utf8mb4 NOT NULL,
  `apellido` varchar(16) CHARACTER SET utf8mb4 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `anotados`
--

INSERT INTO `anotados` (`dni`, `nombre`, `apellido`) VALUES
('11111111', 'merca', 'marcos'),
('11111112', 'merca', 'marcos'),
('11111113', 'merca', 'marcos'),
('11111114', 'merca', 'marcos'),
('12323420', 'merca', 'marcos'),
('12323421', 'merca', 'marcos'),
('12323424', 'merca', 'marcos'),
('12323429', 'merca', 'marcos'),
('12336342', 'merca', 'marcos'),
('12344452', 'merca', 'marcos'),
('12344458', 'merca', 'marcos'),
('12344459', 'merca', 'marcos'),
('12345675', 'merca', 'marcos'),
('12347125', 'merca', 'marcos'),
('22333444', 'merca', 'marcos'),
('23548575', 'merca', 'marcos'),
('33505468', 'merca', 'marcos'),
('33805645', 'merca', 'marcos'),
('41506481', 'merca', 'marcos'),
('41506482', 'merca', 'marcos'),
('41506486', 'merca', 'marcos'),
('41506487', 'merca', 'marcos'),
('44234092', 'merca', 'marcos'),
('44304123', 'merca', 'marcos'),
('44502345', 'merca', 'marcos'),
('44968237', 'merca', 'marcos'),
('45670765', 'merca', 'marcos');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `fechas`
--

CREATE TABLE `fechas` (
  `id` varchar(8) CHARACTER SET utf8mb4 NOT NULL,
  `fechapago` date NOT NULL,
  `fechaexp` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `fechas`
--

INSERT INTO `fechas` (`id`, `fechapago`, `fechaexp`) VALUES
('44502345', '2020-11-05', '2020-11-29'),
('44234092', '2020-11-11', '2020-12-11'),
('44304123', '2020-11-20', '2020-12-20'),
('33805645', '2020-10-28', '2020-11-28'),
('33505468', '2020-10-29', '2020-11-29'),
('23548575', '2020-11-29', '2020-12-29'),
('44968237', '2020-11-11', '2020-12-11'),
('41506487', '2020-11-02', '2020-12-02'),
('41506486', '2020-11-05', '2020-12-05'),
('41506482', '2020-11-12', '2020-12-12'),
('41506481', '2020-11-12', '2020-12-12'),
('12347125', '2020-11-06', '2020-12-06'),
('11111111', '2020-11-05', '2020-11-29'),
('11111112', '2020-05-05', '2020-06-05'),
('11111113', '2020-05-05', '2020-06-05'),
('11111114', '2020-05-05', '2020-06-05'),
('22333444', '2014-05-08', '2014-06-08'),
('12336342', '2020-11-02', '2020-12-02'),
('12323421', '2020-11-02', '2020-12-02'),
('12323420', '2020-11-02', '2020-12-02'),
('12323429', '2020-11-30', '2020-12-30'),
('12323424', '2020-11-30', '2020-12-30'),
('45670765', '2020-11-30', '2020-12-30'),
('12344458', '2020-11-30', '2020-12-30'),
('12344459', '2020-11-30', '2020-12-30'),
('12344452', '2020-11-30', '2020-12-30'),
('12345675', '2020-11-03', '2020-12-03');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `anotados`
--
ALTER TABLE `anotados`
  ADD PRIMARY KEY (`dni`);

--
-- Indices de la tabla `fechas`
--
ALTER TABLE `fechas`
  ADD KEY `id` (`id`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `fechas`
--
ALTER TABLE `fechas`
  ADD CONSTRAINT `fechas_ibfk_1` FOREIGN KEY (`id`) REFERENCES `anotados` (`dni`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
