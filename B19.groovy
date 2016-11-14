/**
 * Created by qinbingbing on 11/11/16.
 * Examples of methods added by the GDK(Groovy Development Kit)
 */

def buildTools = ['Ant', 'Maven', 'Gradle']
assert buildTools.find { it == 'Gradle' } == 'Gradle'
assert buildTools.every { it.size() >= 4 } == false

assert 'gradle'.capitalize() == 'Gradle'

new File('B19.groovy').eachLine { line ->
    println line
}