-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 29-11-2023 a las 20:12:39
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bdviajes`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `chofer2`
--

CREATE TABLE `chofer2` (
  `IDCOD` int(4) NOT NULL,
  `CHONOM` varchar(30) NOT NULL,
  `CHOFIN` varchar(15) NOT NULL,
  `CHOCAT` varchar(1) NOT NULL,
  `CHOSBA` decimal(8,1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `chofer2`
--

INSERT INTO `chofer2` (`IDCOD`, `CHONOM`, `CHOFIN`, `CHOCAT`, `CHOSBA`) VALUES
(1, 'PABLO ALCAZAR', '2023-03-10', 'C', 450.0),
(2, 'JORGE QUISPE', '2001-04-07', 'C', 200.0),
(3, 'EDWARD TEMPLE', '2005-04-11', 'F', 450.0),
(4, 'CHRISTINA MELGAR', '1998-04-10', 'F', 550.0),
(5, 'MARCOS GARECA', '1995-04-12', 'F', 650.0),
(6, 'LUIS PRIETO', '1998-04-12', 'F', 350.0),
(7, 'MARIO CASTANEDA', '2004-04-12', 'F', 350.0),
(8, 'JAIME BENAVIDEZ', '2005-04-12', 'F', 350.0),
(9, 'LAURA GARCÍA', '2022-09-10', 'D', 200.0),
(10, 'PEDRO SANCHEZ', '2023-02-28', 'E', 320.0),
(11, 'ANA MARTINEZ', '2022-12-12', 'A', 150.0),
(12, 'JAVIER PEREZ', '2023-01-03', 'B', 430.0),
(13, 'ISABEL RODRIGUEZ', '2023-04-15', 'C', 1400.0),
(14, 'MIGUEL TORRES', '2022-08-05', 'D', 900.0),
(15, 'LUISA RODRIGUEZ', '2022-11-12', 'E', 750.0),
(16, 'SERGIO GONZALES', '2023-03-18', 'A', 600.0),
(17, 'ELENA PEREZ', '2023-02-09', 'B', 950.0),
(18, 'ROSA ALBERTA', '2023-01-20', 'C', 800.0);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `chofer2`
--
ALTER TABLE `chofer2`
  ADD PRIMARY KEY (`IDCOD`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `chofer2`
--
ALTER TABLE `chofer2`
  MODIFY `IDCOD` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
