/**
 * Created by qinbingbing on 11/11/16.
 * Managing Lists in Groovy
 */

def buildTools = ['Ant', 'Maven']
assert buildTools.getClass() == ArrayList
assert buildTools.size() == 2
assert buildTools[1] == 'Maven'

buildTools << 'Gradle'
assert buildTools.size() == 3
assert buildTools[2] == 'Gradle'

buildTools.each { buildTool ->
    println buildTool
}