<?php
require_once('Car.php');
    class UberBlack extends Car {
        public $typeCarAccepted;
        public $seatMaterial;

        public function _construct($license, $driver, $typeCarAccepted, $seatMaterial) {
            parent::_construct($license,$driver);
            $this->typeCarAccepted = $typeCarAccepted;
            $this->seatsMaterial = $seatMaterial;
        }

    }

        public function setPassenger($passenger) {
            if($passenger == 6) {
                $this->passenger = $passenger;
            } else {
                echo "Necesitas asignar 6 pasajeros";
            }
        }

?>