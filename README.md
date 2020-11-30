# abm-gym
Es una aplicación que abre y cierra ventanas de una habitación, dependiendo de la cantidad de personas que haya en el interior y de la temperatura ambiente. 
Se llevará un conteo de cada persona que ingrese a la habitación, al llegar a cierta temperatura dentro de la misma, automáticamente se abrirán las ventanas y viceversa.  

Se usará un sensor de proximidad para contar las personas que ingresan y las que salen, y otro sensor de temperatura. Los datos obtenidos de los sensores se enviarán a un control, este enviará la orden a un motor que abrirá o cerrará las ventanas.

Los sensores de proximidad, consisten en transductores que detectan la presencia de objetos (obstáculos, personas…) sin necesidad de un contacto.
Los sensores de temperatura son dispositivos que transforman los cambios de temperatura en cambios en señales eléctricas que son procesados por equipo eléctrico o electrónico.

En un funcionamiento real, sería más óptima la utilización de un sensor óptico de barrera, ya que tienen una mayor precisión y velocidad que el sensor ultrasónico.
También, es mejor la utilización de un motor paso a paso, ya que estos tienen mayor torque a velocidades bajas, permitiendo así poder abrir ventanas fabricadas de materiales más pesados.
La no utilización de estos componentes en la simulación es debido a que no están en TinkerCad, ni en otros (puede haber un componente, pero siempre falta otro)
