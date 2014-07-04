import simple.read.only.test.*

class BootStrap {

    def init = { servletContext ->
        new Person(name: "John").save(flush: true, failOnError: true)
    }
    def destroy = {
    }
}
