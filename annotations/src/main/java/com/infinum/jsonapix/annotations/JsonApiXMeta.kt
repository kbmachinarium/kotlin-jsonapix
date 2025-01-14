package com.infinum.jsonapix.annotations

@MustBeDocumented
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class JsonApiXMeta(val type: String)
