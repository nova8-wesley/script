@Grab(group='org.codehaus.groovy.modules.http-builder', module='http-builder', version='0.7' )
import groovyx.net.http.HTTPBuilder

def repoUrl = request.getRepoUrl()
def branch = request.getBranch()
//def commitId = request.getHash()
//When using SCM automated workflows, comment the line above and uncomment the 2 lines below so the hash is not null (example is for Github Actions):

def env = System.getenv()
def commitId = env['GITHUB_SHA']

String scanComment = "Repo: $CIRCLE_PROJECT_REPONAME | Branch: $CIRCLE_BRANCH | Commit ID: $commitId"

println "INFO : Scanning code from $scanComment"

return scanComment
