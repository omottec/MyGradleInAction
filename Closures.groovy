/**
 * Created by qinbingbing on 11/11/16.
 */

// Implicit closure parameter
class ProjectVersion4 {
    Integer major
    Integer minor
}

def incrementMajorProjectVersion = {
    it.major++
}

ProjectVersion4 projectVersion4 = new ProjectVersion4(major: 1, minor: 10)
incrementMajorProjectVersion(projectVersion4)
assert projectVersion4.major == 2


// Closure with single, explicit parameter
incrementMajorProjectVersion = { ProjectVersion4 version ->
    version.major++
}
projectVersion4 = new ProjectVersion4(major: 2, minor: 10)
incrementMajorProjectVersion(projectVersion4)
assert projectVersion4.major == 3


// Closure with multiple, untyped parameters
def setFullProjectVersion = { projectVersion, major, minor ->
    projectVersion.major = major
    projectVersion.minor = minor
}
projectVersion4 = new ProjectVersion4(major: 1, minor: 10)
setFullProjectVersion(projectVersion4, 2, 1)
assert projectVersion4.major == 2
assert projectVersion4.minor == 1


// Closure return value
projectVersion4 = new ProjectVersion4(major: 1, minor: 10)
def minorVersion = { projectVersion4.minor }
assert minorVersion() == 10


// Closure as method parameter
Integer incrementVersion(Closure closure, Integer count) {
    closure() + count
}
projectVersion4 = new ProjectVersion4(major: 1, minor: 10)
assert incrementVersion({ projectVersion4.minor }, 2)

// Setting the delegate for a closure
class ProjectVersion5 {
    Integer major
    Integer minor

    void increment(Closure closure) {
        closure.resolveStrategy = Closure.DELEGATE_ONLY
        closure.delegate = this
        closure()
    }
}

ProjectVersion5 projectVersion5 = new ProjectVersion5(major: 1, minor: 10)
projectVersion5.increment { major += 1 }
assert projectVersion5.major == 2
projectVersion5.increment { minor += 5 }
assert projectVersion5.minor == 15