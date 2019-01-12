create database TiendaSuave

use TiendaSuave

/************    TABLA PRODUCTOS  ***************/
create table Productos (
IdProduc varchar(15) not null,
camisetaHMN varchar (7) not null,
tallaProduc varchar(4) not null, 
unidadesProduc int not null,
precioVentaProduc decimal(6,2)not null,
--detalles varchar (30),
--FechaRegistro date,
--HoraRegistro time

--Clave primaria
primary key (IdProduc)
)

insert into Productos Values
('CAMM001','Mujer','L',7,10.50),--SYSDATETIME(),CONVERT(time, SYSDATETIME())),
('CAMH002','Hombre','M',7,10.50),--SYSDATETIME(),CONVERT(time, SYSDATETIME())),
('CAMN003','Niñ@','S',7,10.50),--SYSDATETIME(),CONVERT(time, SYSDATETIME())),
('CAMM004','Mujer','XL',7,17.50),--SYSDATETIME(),CONVERT(time, SYSDATETIME())),
('CAMH005','Hombre','XXL',7,3.50),--SYSDATETIME(),CONVERT(time, SYSDATETIME())),
('CAMH007','Hombre','M',24,7.25)--,SYSDATETIME(),CONVERT(time, SYSDATETIME()))

select * from Productos


create table Clientes (
IdClien varchar (10) not null,
NombClien varchar (40) not null, 
ApelClien varchar (40) not null,
DirecClien varchar(40)not null,
EmailClien varchar (40) null,
TlfClien varchar (12)null,
/**FechaRegistClien date null,
HoraRegistClien time null,*/
fecha datetime DEFAULT getdate(),
--clave Primaria
primary key (IdClien)
)

insert into Clientes values
('1723718607','ARMANDO','PAREDES','SAN JUAN','armapared@hotmail.com',2647834,GETDATE())

insert into Clientes values
('1723718609','JUAN','VALVERDE','JUAN DE SALINAS','juanvalver@hotmail.com',2346732,'20120618 10:34:09')

--drop table Clientes

select * from Clientes




/*************** Procedimientos almacenados ****************/
/********     Registro Productos ********/
go 
create procedure AgregaProducto (
@IdProduc varchar (15),
@camisetaHMN varchar (7),
@tallaProduc varchar (4),
@unidadesProduc int,
@precioVentaProduc decimal (6,2))
as begin
insert into Productos values(@IdProduc,@camisetaHMN,@tallaProduc,@unidadesProduc, @precioVentaProduc)
end 
go

/************* Eliminacion  Productos**************/
go 
create procedure EliminarProducto (
@IdProduc varchar (15))
as begin
delete from Productos where IdProduc = @IdProduc
end 
go

/*************  Busqueda por tipo camiseta HMN *****************/

go 
create procedure BusquedaProductoPorHMN (
@CamisetaHMN varchar (7))
as begin
select * from Productos where CamisetaHMN = @CamisetaHMN
end 
go


/**********  Registro de Clientes   ************/
select * from Clientes
select * from Productos
go 
create procedure AgregaCliente (
@IdClien varchar (10),
@NombClien varchar (40),
@ApelClien varchar (40),
@DirecClien varchar (40),
@EmailClien varchar (40),
@TlfClien varchar (12),
@fecha datetime)

as begin 
insert into Clientes values (@IdClien,@NombClien,@ApelClien,@DirecClien,@EmailClien,@TlfClien, @fecha)
end
go

drop procedure AgregaCliente
delete from Clientes where IdClien like '1723718605'