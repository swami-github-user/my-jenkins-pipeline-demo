def buildFunction () {
    echo 'This build message is displayed through a groovy function'
}

def testFunction () {
    echo 'This test message is displayed through a groovy function only after Compliance verification'
}

def deployFunction () {
    echo "In this stage we deploy our application with version ${params.VERSION}"
}

return this 
