class Account:
    id = int
    name, document, email, password = str
    
    def _init_(self, name, document):
        self.name   =   name
        self.document   =   document