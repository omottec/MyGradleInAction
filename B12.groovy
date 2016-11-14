/**
 * Created by qinbingbing on 11/11/16.
 * Setting field values with named parameters
 */

class ProjectVersion3 {
    Integer major
    Integer minor
}

ProjectVersion3 projectVersion3 = new ProjectVersion3(major: 1, minor: 10)
assert projectVersion3.minor == 10
projectVersion3.minor = 30
assert projectVersion3.minor == 30
