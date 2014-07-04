action: Person.get(params.id) and then properties = params

controller: no annotation  
action: @Transactional(readOnly = true)  
service: not called  
behaviour: ajax changes not saved


controller: no annotation  
action: @Transactional(readOnly = true)  
service: def transactional = false (method just println)  
behaviour: ajax changes not saved


controller: no annotation  
action: @Transactional(readOnly = true)  
service: no def transactional = false (method just println)  
behaviour: ajax changes not saved


controller: no annotation  
action: @Transactional(readOnly = true)  
service: no def transactional = false (method gets person object and updates name)  
behaviour: ajax changes saved (change to age from the screen and also name updated in service)


controller: no annotation  
action: @Transactional(readOnly = true)  
service: def transactional = false (method gets person object and updates name)  
behaviour: ajax changes saved (change to age from the screen and also name updated in service)


controller: no annotation  
action: @Transactional(readOnly = true)  
service: def transactional = false (method saves a new book)  
behaviour: ajax changes saved and book inserted


controller: no annotation  
action: @Transactional(readOnly = true)  
service: def transactional = false (method saves a new book in a withTransaction block)  
behaviour: ajax changes saved and book inserted


controller: no annotation  
action: @Transactional(readOnly = true)  
service: def transactional = false (method saves a new book in a withNewTransaction block)  
behaviour: ajax changes not saved and book inserted


controller: no annotation  
action: @Transactional(readOnly = true)  
service: def transactional = false (method gets person with person's argument id and updates the obtained object's name)  
behaviour: ajax changes not saved (age not updated in db even tho changed on the screen) but name updated


controller: no annotation  
action: @Transactional(readOnly = true)  
service: no def transactional = false (method gets person with person's argument id and updates the obtained object's name)  
behaviour: ajax changes not saved (age not updated in db even tho changed on the screen) but name updated
