import { useRouter } from "next/router"
import { Layout } from "../components/Layout"
import en from "@/languages/en"
import es from "@/languages/es"
import fr from "@/languages/fr"
import Link from "next/link"

export default function Home() {
  const router = useRouter()
  let t
  if (router.locale === 'en') {
    t = en
  } else if (router.locale === 'es') {
    t = es
  } else if (router.locale === 'fr') {
    t = fr
  }


  return (
    <Layout title="tech4good - Home">
      <div className="container_home">
         <div className="home_content">
            <h1>Moute, <span className="home_bold">Barcelona.</span></h1>
            <p>El <span className="home_bold">comerç local</span> contribueix a una <span className="home_bold">Barcelona</span> més forta, vibrant i sostenible.</p>
            <p>Et donem tota <span className="home_bold">la informació que necessites.</span></p>
            <button className="home_button"><Link href={"/comercios"} >Busca al meu entorn</Link></button> 
        </div>
      </div>  
    </Layout>
  )
}
