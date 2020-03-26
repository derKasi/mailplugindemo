package example

import grails.plugins.mail.MailService

class HelloController {
	static responseFormats = ['json', 'xml']

    MailService mailService

    def index() {
        respond model: [message: "Hello World!"]
    }

    def test() {
        mailService.sendMail {
            from "admin@mysystem.com"
            subject "New user"
            text "A new user has been created"
        }
        respond model: [message: "Mail sent!"]
    }
}
