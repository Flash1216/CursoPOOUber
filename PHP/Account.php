<?php

class Account {
    public $id = integer;
    public $name = string;
    public $document = string;
    public $email = string;
    public $password = string;


    public function _construct($name, $document) {
        $this->name = $name;
        $this->document = $document;
    }

}