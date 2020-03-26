package example

class UrlMappings {

    static mappings = {
        "/maildemo" (controller: 'hello', action: 'test')
        "/"(controller: 'application', action:'index')
        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
