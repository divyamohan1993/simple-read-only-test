package simple.read.only.test

import grails.transaction.Transactional

class PersonService {

    //def transactional = false

    def doSomething(person) {
        Book.withNewTransaction {
            def z = Person.get(person.id)
            z.name = person.name + "_service"
            z.save(flush: true, failOnError: true)
            //def z = new Book(title: "Book")
            //z.save(flush: true, failOnError: true)
        }
        println 'called'
    }
}
