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


?>