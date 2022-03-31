# android-compose-collectAsState-with-navigate

## Prerequisites

Repository(DataSource) provides not `StateFlow<T>` but `Flow<T>` API.

## Bad pattern

call `collectAsFlow()` to `Flow<T>` with initial value.

When dataSource emits new value, only `LaunchedEffect` is called and no composable is displayed..

## Good pattern

collect value from dataSource and put it to another `MutableStateFlow<T>`

