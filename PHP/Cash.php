<?php

require_once('Payment.php');
class Cash extends Payment {

    public function _construct($id) {
        parent::_construct($id);
    }
}

?>