from car import Car
from account import Account

if __name__== "_main_":
    print*("Hola Mundo")
    
    car = Car("MUT-1902", Account("Andres Perez", "PQE-12331"))
    print(vars(car))
    print(vars(car.driver))