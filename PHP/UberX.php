<?php 
require_once('Car.php');

class UberX extends Car {
    public $brand;
    public $model;

    public function _construct($license, $driver, $brand, $model) {
        parent::_construct($license, $driver);
        this->license = $license;
        this->driver = $driver;
    }

}

?>