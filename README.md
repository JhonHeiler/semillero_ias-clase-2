# semillero_ias-clase-2



Actividad 2


En la aplicación creada en la actividad 1, crear las siguientes capas con su especificación:

1.	Dominio
Crear una clase para representar un “Servicio de mantenimiento (MaintenanceService)”, dicho servicio debe tener los siguientes campos:
a.	Identificador del servicio: Cadena de texto no nula, con tamaño exacto de 36 caracteres.
b.	Fecha y hora de inicio del servicio: No puede ser nula ni representar una fecha y hora en el futuro
c.	Fecha y hora de fin del servicio: No puede ser nula, no puede representar una fecha anterior a la de inicio, ni representar una fecha y hora en el futuro.
d.	Descripción del servicio: No puede ser nula, no puede estar vacío y debe ser máximo de 512 caracteres.


2. Controladores
a.	Crear endpoint GET para consultar un servicio de mantenimiento, que reciba como parámetro de URL el identificador del servicio (eg: “/services/{id}”)
b.	Crear un endpoint GET para consultar todos los servicios, que reciba como parámetros de consulta la cantidad de registros a retornar (limit) y la cantidad de registros a saltar (skip), ambos valores son números enteros
c.	Crear un endpoint POST para crear un servicio que reciba un body con los siguientes campos del servicio: fecha y hora de inicio, fecha y hora de fin y descripción.
d.	Crear un DTO (Data Transfer Object) que representa un servicio en la capa del controlador y adicionar el método  fromDomain para transformar un servicio del dominio en el DTO



3. Repositorio
a.	Crear un paquete que represente la capa del repositorio y crear un DBO (DataBase Object) que representa el servicio de dominio pero en términos de base de datos.
b.	Adicionar los métodos toDomain para transformar un DBO en la case de servicio del dominio y fromDomain para transformar un servicio del dominio en el DBO


![1](https://user-images.githubusercontent.com/89054795/157663649-dd493c5b-8086-4301-9653-fcd316f4c04e.png)



![2](https://user-images.githubusercontent.com/89054795/157663670-5f72aed5-24d4-4909-8204-f01225c7ff36.png)


![3](https://user-images.githubusercontent.com/89054795/157663695-b96b126c-a357-4da3-9a97-150bf5a4173a.png)
