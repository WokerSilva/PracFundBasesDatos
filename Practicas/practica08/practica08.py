import psycopg2

# Reemplaza estos valores con los de tu instancia ElephantSQL
elephantsql_url = "postgres://hfghjpts:cmA-snWxIBSqeTWvaErQEALMn0k_UGTx@suleiman.db.elephantsql.com/hfghjpts"

# Conecta a ElephantSQL
conn = psycopg2.connect(elephantsql_url)

# Crea un cursor
cursor = conn.cursor()

# Ahora puedes ejecutar consultas en la base de datos ElephantSQL desde tu local.
