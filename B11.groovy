/**
 * Created by qinbingbing on 11/11/16.
 * Managing Maps in Groovy
 */

def inceptionYears = ['Ant': 2000, 'Maven': 2004]
assert inceptionYears.getClass() == LinkedHashMap
assert inceptionYears.size() == 2
assert inceptionYears.Ant == 2000
assert inceptionYears['Ant'] == 2000

inceptionYears['Gradle'] = 2009
assert inceptionYears.size() == 3
assert inceptionYears['Gradle'] == 2009

inceptionYears.each { buildTool, year ->
    println "$buildTool was first released in $year"
}
