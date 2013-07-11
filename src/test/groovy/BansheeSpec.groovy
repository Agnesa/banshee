import com.smauel.banshee.Banshee
import spock.lang.Specification
import static org.hamcrest.core.Is.is

class BansheeSpec extends Specification {
    Banshee banshee

    def setup() {
        banshee = new Banshee()
    }

    def "should add two number together"() {
        expect:
        result == banshee.add(a, b)

        where:
        a   | b     | result
        1   | 1     | 2
        1   | 2     | 3
        1   | -1    | 0
        -1  | -1    | -2
    }

    def "should say hello"() {
        expect:
        message == banshee.sayHello(name)

        where:
        name    | message
        "Sam"   | "Hello Sam"
        "Hello" | "Hello Hello"
    }

    def "should list all names"() {
        setup:
        def names = ["Sam", "Phil", "Sarah", "Esther"] as String[]

        when:
        def listOfNames = banshee.listNames(names)

        then:
        println listOfNames.size()
        listOfNames.size() == 4
    }

}  