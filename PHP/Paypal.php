<?php
require_once("Payment.php");

class Paypal extends Payment {
    public function _construct($id, $referencia, $sucursal) {
        parent::_construct($id);
        $this->referencia = $referencia;
        $this->sucursal = $sucursal;
    }
}

?>