@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package captain

import kotlin.js.JsExport

class RouteInfo<out C>(
    val params: RouteMatchParams,
    val config: Url,
    val route: Url,
    val children: C
)