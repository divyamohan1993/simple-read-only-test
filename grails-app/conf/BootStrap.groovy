import simple.read.only.test.*

class BootStrap {

    def init = { servletContext ->
        new Person(name: "John", age: 30).save(flush: true, failOnError: true)
    }
    def destroy = {
    }
}
