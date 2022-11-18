<?php

require_once('Account.php');

class Car {
    public $id = integer;
    public $license = string;
    public $driver = string;
    public $passenger = string;

    public function _construct($license, $driver) {
        $this->license = $license;
        $this->driver = $driver;
    }

    public function PrintDataCar() {
        echo "License: $this->license, conductor: {$this->driver->name}, document: {$this->driver->document}";
 
    }

}