/**
 * Created by qinbingbing on 11/11/16.
 * Optional typing for variables and methods
 */

class ProjectVersion2 {
    int major
    int minor

    ProjectVersion2(int major, int minor) {
        this.major = major
        this.minor = minor
    }
}

def buildTool = 'Gradle'
assert buildTool.class == String

def initProjectVersion2(major, minor) {
    new ProjectVersion2(major, minor)
}

assert initProjectVersion2(1, 3).class == ProjectVersion2