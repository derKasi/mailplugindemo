package example

class HelloController {
	static responseFormats = ['json', 'xml']
	
    def index() {
        respond "Hello World!"
    }
}
