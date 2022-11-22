<?php
require_once('Payment.php');

class Card extends Payment {
    public function _construct($id, $numberCard, $expiration, $ccv) {
        parent::_construct($id);
        $this->numberCard = $numberCard;
        $this->expiration = $expiration;
        $this->ccv = $ccv;
    }
}



?>