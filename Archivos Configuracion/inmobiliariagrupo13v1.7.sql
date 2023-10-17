-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 17-10-2023 a las 17:30:14
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
-- Base de datos: `inmobiliariagrupo13`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `contrato`
--

CREATE TABLE `contrato` (
  `idContrato` int(11) NOT NULL,
  `idPropiedad` int(11) NOT NULL,
  `idPropietario` int(11) NOT NULL,
  `idInquilino` int(11) NOT NULL,
  `idGarante` int(11) NOT NULL,
  `idVendedor` int(11) NOT NULL,
  `fechaInicio` date NOT NULL,
  `fechaFin` date NOT NULL,
  `fechaContrato` date NOT NULL,
  `vigente` tinyint(4) NOT NULL,
  `activo` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `contrato`
--

INSERT INTO `contrato` (`idContrato`, `idPropiedad`, `idPropietario`, `idInquilino`, `idGarante`, `idVendedor`, `fechaInicio`, `fechaFin`, `fechaContrato`, `vigente`, `activo`) VALUES
(2, 1, 1, 1, 1, 1, '2023-03-05', '2026-03-05', '2023-03-02', 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estado`
--

CREATE TABLE `estado` (
  `idEstado` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `activo` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `estado`
--

INSERT INTO `estado` (`idEstado`, `nombre`, `activo`) VALUES
(1, 'Excelente estado', 1),
(2, 'Buen estado', 1),
(3, 'Estado regular', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `garante`
--

CREATE TABLE `garante` (
  `idGarante` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `dni` varchar(30) NOT NULL,
  `domicilio` varchar(30) NOT NULL,
  `telefono` char(30) NOT NULL,
  `activo` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `garante`
--

INSERT INTO `garante` (`idGarante`, `nombre`, `apellido`, `dni`, `domicilio`, `telefono`, `activo`) VALUES
(1, 'Luis', 'Medina', '987', 'No tiene casa', '168496874', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inquilino`
--

CREATE TABLE `inquilino` (
  `idInquilino` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `dni` varchar(30) NOT NULL,
  `cuit` varchar(30) NOT NULL,
  `lugarTrabajo` varchar(30) NOT NULL,
  `activo` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `inquilino`
--

INSERT INTO `inquilino` (`idInquilino`, `nombre`, `apellido`, `dni`, `cuit`, `lugarTrabajo`, `activo`) VALUES
(1, 'Pedro', 'Perez', '111', '1654', 'Fabrica', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inspector`
--

CREATE TABLE `inspector` (
  `idInspector` int(11) NOT NULL,
  `matricula` varchar(30) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `telefono` varchar(30) NOT NULL,
  `activo` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `inspector`
--

INSERT INTO `inspector` (`idInspector`, `matricula`, `nombre`, `apellido`, `telefono`, `activo`) VALUES
(1, 'D-51657', 'Jose', 'Ramirez', '156784576', 1),
(2, 'D -20563', 'Juan Ignacio', 'Piazza', '221789124', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `nivele_acceso`
--

CREATE TABLE `nivele_acceso` (
  `idNiveleAcceso` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `propiedad`
--

CREATE TABLE `propiedad` (
  `idPropiedad` int(11) NOT NULL,
  `idPropietario` int(11) NOT NULL,
  `direccion` varchar(30) NOT NULL,
  `altura` int(10) NOT NULL,
  `idTipo` int(11) NOT NULL,
  `superficieTotal` int(11) NOT NULL,
  `precioTasado` double NOT NULL,
  `antiguedad` int(5) NOT NULL,
  `idServicios` int(11) NOT NULL,
  `idInspector` int(11) NOT NULL,
  `idZona` int(11) NOT NULL,
  `idEstado` int(11) NOT NULL,
  `observaciones` varchar(300) NOT NULL,
  `disponible` tinyint(4) NOT NULL,
  `activo` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `propiedad`
--

INSERT INTO `propiedad` (`idPropiedad`, `idPropietario`, `direccion`, `altura`, `idTipo`, `superficieTotal`, `precioTasado`, `antiguedad`, `idServicios`, `idInspector`, `idZona`, `idEstado`, `observaciones`, `disponible`, `activo`) VALUES
(1, 1, 'Belgrano', 213, 2, 1900, 140000, 0, 1, 2, 1, 1, 'Departamento nuevo, a estrenar, bla bla bla', 1, 1),
(2, 1, 'Echevarria 540', 897, 1, 300, 250000, 3, 1, 1, 1, 1, 'tiene luz y electricidad', 1, 1),
(3, 2, 'Calle 45', 892, 1, 500, 200000, 6, 1, 1, 1, 2, 'rwerwrdasd asdas', 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `propietario`
--

CREATE TABLE `propietario` (
  `idPropietario` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `dni` varchar(8) NOT NULL,
  `telefono` varchar(30) NOT NULL,
  `domicilio` varchar(30) NOT NULL,
  `activo` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `propietario`
--

INSERT INTO `propietario` (`idPropietario`, `nombre`, `apellido`, `dni`, `telefono`, `domicilio`, `activo`) VALUES
(1, 'Luciana', 'Juarez', '7126', '0', '234848', 1),
(2, 'Julio', 'Santos', '65789', '0', '16876546', 1),
(3, 'Chico', 'Matias', '333', '781101', 'Pasteur 656', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tarea_permitida`
--

CREATE TABLE `tarea_permitida` (
  `idTareaPermitida` int(11) NOT NULL,
  `tarea` varchar(50) NOT NULL,
  `idNivelAcceso` int(11) NOT NULL,
  `activo` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo`
--

CREATE TABLE `tipo` (
  `idTipo` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `activo` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `tipo`
--

INSERT INTO `tipo` (`idTipo`, `nombre`, `activo`) VALUES
(1, 'Casa', 1),
(2, 'Depto', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `idUsuario` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `activo` tinyint(4) NOT NULL,
  `idNivelAcceso` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vendedor`
--

CREATE TABLE `vendedor` (
  `idVendedor` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `dni` varchar(30) NOT NULL,
  `telefono` varchar(30) NOT NULL,
  `activo` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `vendedor`
--

INSERT INTO `vendedor` (`idVendedor`, `nombre`, `apellido`, `dni`, `telefono`, `activo`) VALUES
(1, 'Fulanito', 'Cosmo', '64841', '26987546', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `zona`
--

CREATE TABLE `zona` (
  `idZona` int(11) NOT NULL,
  `provincia` varchar(30) NOT NULL,
  `ciudad` varchar(30) NOT NULL,
  `barrio` varchar(30) NOT NULL,
  `activo` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `zona`
--

INSERT INTO `zona` (`idZona`, `provincia`, `ciudad`, `barrio`, `activo`) VALUES
(1, 'Entre Rios', 'Parana', 'Puerto', 0),
(2, 'Buenos Aires', 'Capital', 'Recoleta', 1),
(3, 'Buenos Aires', 'Mar del Plata', 'Guemes', 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `contrato`
--
ALTER TABLE `contrato`
  ADD PRIMARY KEY (`idContrato`),
  ADD KEY `idInquilino` (`idInquilino`),
  ADD KEY `idPropiedad` (`idPropiedad`),
  ADD KEY `idPropietario` (`idPropietario`),
  ADD KEY `idVendedor` (`idVendedor`),
  ADD KEY `idGarante` (`idGarante`);

--
-- Indices de la tabla `estado`
--
ALTER TABLE `estado`
  ADD PRIMARY KEY (`idEstado`);

--
-- Indices de la tabla `garante`
--
ALTER TABLE `garante`
  ADD PRIMARY KEY (`idGarante`);

--
-- Indices de la tabla `inquilino`
--
ALTER TABLE `inquilino`
  ADD PRIMARY KEY (`idInquilino`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indices de la tabla `inspector`
--
ALTER TABLE `inspector`
  ADD PRIMARY KEY (`idInspector`);

--
-- Indices de la tabla `nivele_acceso`
--
ALTER TABLE `nivele_acceso`
  ADD PRIMARY KEY (`idNiveleAcceso`);

--
-- Indices de la tabla `propiedad`
--
ALTER TABLE `propiedad`
  ADD PRIMARY KEY (`idPropiedad`),
  ADD KEY `idPropietario` (`idPropietario`),
  ADD KEY `idEstado` (`idEstado`),
  ADD KEY `idInspector` (`idInspector`),
  ADD KEY `idServicios` (`idServicios`),
  ADD KEY `idTipo` (`idTipo`),
  ADD KEY `idZona` (`idZona`);

--
-- Indices de la tabla `propietario`
--
ALTER TABLE `propietario`
  ADD PRIMARY KEY (`idPropietario`);

--
-- Indices de la tabla `tarea_permitida`
--
ALTER TABLE `tarea_permitida`
  ADD PRIMARY KEY (`idTareaPermitida`),
  ADD UNIQUE KEY `idNivelAcceso` (`idNivelAcceso`) USING BTREE;

--
-- Indices de la tabla `tipo`
--
ALTER TABLE `tipo`
  ADD PRIMARY KEY (`idTipo`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`idUsuario`),
  ADD UNIQUE KEY `idNivelAcceso` (`idNivelAcceso`);

--
-- Indices de la tabla `vendedor`
--
ALTER TABLE `vendedor`
  ADD PRIMARY KEY (`idVendedor`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indices de la tabla `zona`
--
ALTER TABLE `zona`
  ADD PRIMARY KEY (`idZona`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `contrato`
--
ALTER TABLE `contrato`
  MODIFY `idContrato` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `estado`
--
ALTER TABLE `estado`
  MODIFY `idEstado` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `garante`
--
ALTER TABLE `garante`
  MODIFY `idGarante` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `inquilino`
--
ALTER TABLE `inquilino`
  MODIFY `idInquilino` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `inspector`
--
ALTER TABLE `inspector`
  MODIFY `idInspector` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `nivele_acceso`
--
ALTER TABLE `nivele_acceso`
  MODIFY `idNiveleAcceso` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `propiedad`
--
ALTER TABLE `propiedad`
  MODIFY `idPropiedad` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `propietario`
--
ALTER TABLE `propietario`
  MODIFY `idPropietario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `tarea_permitida`
--
ALTER TABLE `tarea_permitida`
  MODIFY `idTareaPermitida` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tipo`
--
ALTER TABLE `tipo`
  MODIFY `idTipo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `idUsuario` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `vendedor`
--
ALTER TABLE `vendedor`
  MODIFY `idVendedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `zona`
--
ALTER TABLE `zona`
  MODIFY `idZona` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `contrato`
--
ALTER TABLE `contrato`
  ADD CONSTRAINT `contrato_ibfk_1` FOREIGN KEY (`idInquilino`) REFERENCES `inquilino` (`idInquilino`),
  ADD CONSTRAINT `contrato_ibfk_2` FOREIGN KEY (`idPropiedad`) REFERENCES `propiedad` (`idPropiedad`),
  ADD CONSTRAINT `contrato_ibfk_3` FOREIGN KEY (`idPropietario`) REFERENCES `propietario` (`idPropietario`),
  ADD CONSTRAINT `contrato_ibfk_4` FOREIGN KEY (`idVendedor`) REFERENCES `vendedor` (`idVendedor`),
  ADD CONSTRAINT `contrato_ibfk_5` FOREIGN KEY (`idGarante`) REFERENCES `garante` (`idGarante`);

--
-- Filtros para la tabla `propiedad`
--
ALTER TABLE `propiedad`
  ADD CONSTRAINT `propiedad_ibfk_1` FOREIGN KEY (`idPropietario`) REFERENCES `propietario` (`idPropietario`),
  ADD CONSTRAINT `propiedad_ibfk_2` FOREIGN KEY (`idEstado`) REFERENCES `estado` (`idEstado`),
  ADD CONSTRAINT `propiedad_ibfk_3` FOREIGN KEY (`idInspector`) REFERENCES `inspector` (`idInspector`),
  ADD CONSTRAINT `propiedad_ibfk_5` FOREIGN KEY (`idTipo`) REFERENCES `tipo` (`idTipo`),
  ADD CONSTRAINT `propiedad_ibfk_6` FOREIGN KEY (`idZona`) REFERENCES `zona` (`idZona`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
