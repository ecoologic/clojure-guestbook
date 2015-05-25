;; Anything you type in here will be executed
;; immediately with the results shown on the
;; right.
(use 'guestbook.repl)
; (start-server)

; (use 'guestbook.routes.home)

; (ns-unmap 'user 'save-message)

(use 'guestbook.models.db)
; (create-guestbook-table)

; (save-message "Bob" "Hello!")

(read-guests)
