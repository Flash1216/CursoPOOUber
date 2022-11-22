<?php
require_once('account.php');
class Car {
    public $id = int;
    public $license = int;
    public $driver = string;
    public $passenger = string;

    public function __construct($license, $driver){
        $this->license = $license;
        $this->driver = $driver;
    }

    public function printDataCar() {
        echo "Licencia: $this->license 
              Driver:  {$this->driver->name}
              Numero de pasajeros: $this->passenger
              ";

    }

    public function getPassenger(){
        return $this->passenger;
    }

    public function setPassenger($passenger) {
        if($passenger == 4){
            $this->passenger = $passenger;
        } else {
            echo "Necesitas asignar 4 pasajeros";
        }
    }

}
?>