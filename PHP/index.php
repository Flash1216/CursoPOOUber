<?php

require_once('Car.php');
require_once('Account.php');

$car = new Car("XDE567", new Account("Juan Perez", "ADOP123"));

$car->printDataCar();